from konlpy.tag import Hannanum

han = Hannanum()
f = open('text.txt', 'r')
lines = f.readlines()

for line in lines :
    item = line.split(".")

    for i in item:
        print(i)
        print(han.pos(i))

