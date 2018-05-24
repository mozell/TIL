import pickle
from konlpy.tag import Kkma
from gensim.models import word2vec
from gensim.models.keyedvectors import KeyedVectors

# 분석할 문장 받고, 파싱하고 다른 텍스트로 저장
kk = Kkma()
f = open('elec.txt', 'r')
lines = f.readlines()

result = open('result.pickle', 'wb')
for line in lines :
    item = line.split(".")
    print("item >>",item)

    for i in item:
        try:                        # 공백문장 스킵해서 파싱하고 저장
            print("i    >>",i)
            print("pos  >>",kk.pos(i))
            print()
            pickle.dump(kk.pos(i), result, pickle.HIGHEST_PROTOCOL)
        except:
            continue

f.close()
result.close()

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

print(wordToken)

embedding = word2vec.Word2Vec(wordToken, size=5000, window=3, negative=3, min_count=1)
embedding.wv.save_word2vec_format('elec.embedding', binary=False)
model = KeyedVectors.load_word2vec_format('elec.embedding', binary=False, encoding='utf-8')

print(model.wv['전자파'])
print(model.most_similar('전자파'))