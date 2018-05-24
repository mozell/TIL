import pickle

list = ['a', 'b', 'c']

#입력
with open('list.txt', 'wb') as f:
    pickle.dump(list, f)

#로드 : 한 줄씩 파일을 읽어오고 더이상 로드할 데이가 없으면 EOFError 발생
with open('list.txt', 'rb') as f:
    data = pickle.load(f)   #한줄씩 읽어온다

print(data)


#### 참고
# pickle.load(FILE) 을 통해서 파일 내용을 읽어오려면, 
# pickle.dump를 사용해서 데이터를 입력한 파일이어야 한다.
