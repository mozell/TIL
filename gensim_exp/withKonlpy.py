import pickle
from konlpy.tag import Kkma
from gensim.models import word2vec
from gensim.models.keyedvectors import KeyedVectors

token = []
with open('result.pickle', 'rb') as f:
    while True:
        try:
            data = pickle.load(f)
            token.append(data)
        except EOFError as e:
            break

wordToken = []
for i in token:             #문장 리스트에 접근
    wordTokenElement = []
    for j in i:             #리스트의 요소에 접근
        wordTokenElement.append(j[0])
    wordToken.append(wordTokenElement)

# print(wordToken)

embedding = word2vec.Word2Vec(wordToken, size=10000, window=1, negative=3, min_count=1)
embedding.wv.save_word2vec_format('elec.embedding', binary=False)
model = KeyedVectors.load_word2vec_format('elec.embedding', binary=False, encoding='utf-8')

# print(model.wv['전자파'])
# print(model.most_similar('전자파'))

a = model.most_similar('전자파')
for i in a:
    print(i[0]," ",end="")
