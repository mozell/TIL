from soynlp.tokenizer import LTokenizer

scores = {'날씨':0.5,
          '맑다':0.5,
          '흐리다':0.5,
          '흐림':0.45,
          '오늘':0.4,
          '내일':0.4,
          '대체로':0.2,
          '것':0.01
          }

tokenizer = LTokenizer(scores= scores)

sent = '오늘의 날씨는 대체로 맑고, 내일의 날씨는 흐릴 것이다.'

print(tokenizer.tokenize(sent, flatten = False))
print(tokenizer.tokenize(sent))