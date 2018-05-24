#http://younggyunhahm.blogspot.kr/2017/06/word-embedding-for-korean-using-gensim.html

from gensim.models import word2vec
from gensim.models.keyedvectors import KeyedVectors

with open('elec.txt', 'r') as f:
    text = f.readlines()

token = [s.split() for s in text]
print(token)
print(type(token))
#보통 vector 의 dimension 은 100~300 정도를 사용하지만, 이 경우 데이터 양이 적으므로 다음과 같은 파라미터로 학습해 보자
#- size = vector의 dimension
#- window = 고려하는 context, 이 경우 만약 '너를' 이라는 단어의 경우에는 앞뒤 단어 1개씩을 context로 고려한다.
#- negative = word embedding 은 학습시 정답에 대해서는 높은 점수를 받도록, 오답에 대해서는 낮은 점수를 받도록 학습한다. 즉 cost function 이 minimize 하는 것인데 이론적인 것은 tensorflow tutorial 이면 충분할 것이다.
embedding = word2vec.Word2Vec(token, size=200, window=2, negative=3, min_count=1)

embedding.save('my.model')
# 불러올 때
#model = WORD2VEC.load('my.model')   이거 안됨 우분투 기준이라 그런가

embedding.wv.save_word2vec_format('my.embedding', binary=False)
# 불러올 때
#from gensim.models.keyedvectors import KeyedVectors
#model = KeyedVectors.load_word2vec_format('my.embedding', binary=False, encoding='utf-8')

model = KeyedVectors.load_word2vec_format('my.embedding', binary=False, encoding='utf-8')
print(model.wv['전자파'])
print(model.most_similar('전자파'))