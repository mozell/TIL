from konlpy.tag import Kkma

kk = Kkma()
f = open('elec.txt', 'r')
lines = f.readlines()

result = open('result.txt', 'w', encoding='utf-8')
for line in lines :
    item = line.split(".")

    for i in item:
        try:
            print(i)
            print(kk.pos(i))
            result.write(i)
            result.write(str(kk.pos(i)))
            result.write('\n')
        except:
            print()
            continue

f.close()
result.close()