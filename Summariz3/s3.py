import re
from konlpy.tag import Twitter
from collections import Counter
import itertools
import networkx

twitter = Twitter()

class Sentence:

    @staticmethod
    def co_occurence(sentence1, sentence2):
        p = sum((sentence1.bow & sentence2.bow).values())
        q = sum((sentence1.bow | sentence2.bow).values())
        return p / q if q else 0

    def __init__(self, text, index = 0):
        self.index = index
        self.text = text
        self.nouns = twitter.nouns(self.text)
        self.bow = Counter(self.nouns)

    def __eq__(self, another):
        return hasattr(another, 'index') and self.index == another.index

    def __hash__(self):
        return self.index

    #index는 원문에서의 문장 위치를 나타내는데 쓰인다

def xplit(*delimiters):
    return lambda value: re.split('|'.join([re.escape(delimiter) for delimiter in delimiters]), value)

def get_sentences(text):
    candidates = xplit('. ', '? ', '! ', '\n', '.\n')(text.strip())
    sentences = []
    index = 0
    for candidate in candidates:
        candidate = candidate.strip()
        if len(candidate):
            sentences.append(Sentence(candidate, index))
            index += 1
    return sentences

def build_graph(sentences):
    graph = networkx.Graph()
    graph.add_nodes_from(sentences)
    pairs = list(itertools.combinations(sentences, 2))
    for eins, zwei in pairs:
        graph.add_edge(eins, zwei, weight= Sentence.co_occurence(eins, zwei))
    return graph

text= "보이지 않아 더 위협적인 전자파. 전자제품은 현대인의 삶에 없어서는 안 될 가장 중요한 물건이 됐습니다. 첨단 전자기기가 제공하는 편리함으로 인간 생활은 눈부신 진보를 이뤘지만, 이에 따른 피해도 늘고 있습니다. 그 중 하나가 보이지 않는 전자파에 의한 피해입니다. 인식하지 못하지만 우리가 사는 세상은 다양한 종류의 전자파로 가득 차 있습니다. 아침에 일어나 가장 먼저 하는 일은 전자파를 많이 내뿜는 스마트폰을 확인하는 일입니다. 출근길도 예외는 아닙니다. 지하철과 버스에서 쓰이는 교통카드나 고속도로 하이패스, 자동차의 스마트키와 GPS까지 우리 생활 전반에 걸쳐 무수히 많은 전자파에 노출된 채 살고 있습니다."

s = Sentence(text)
sentences = get_sentences(text)
graph = build_graph(sentences)
pagerank = networkx.pagerank(graph, weight= 'weight')
reordered = sorted(pagerank, key=pagerank.get, reverse=True)



print(reordered[0].text)
print(reordered[1].text)