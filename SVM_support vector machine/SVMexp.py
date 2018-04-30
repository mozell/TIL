import random

def calc_bmi(h, w):
    bmi = w / (h/100)**2
    if bmi < 18.5 : return "thin"
    if bmi < 25 : return "normal"
    return "fat"

fp = open('bmi.csv', "w", encoding="utf-8")
fp.write("height,weight,label\r")

cnt = {"thin":0, "normal":0, "fat":0}
for i in range(20000):
    h = random.randint(120,200)
    w = random.randint(35,80)
    label = calc_bmi(h, w)
    cnt[label] += 1;
    fp.write("{0},{1},{2}\r".format(h, w, label))
fp.close()
print("무작위 데이터 생성 :", cnt)
