import math
r=int(input())
ed=False
v="# "
e="  "
c="* "
for i in range(-r+1,1):
    if  i==0:
        i-=1
        ed=True
    print(e*(r-int(math.sqrt(r*r-i*i))-1),end='')
    print(c+v*( abs(-int(math.sqrt(r*r-i*i))- int(math.sqrt(r*r-i*i))) -1) +c,end='')
    print(e*abs(2*(r-int(math.sqrt(r*r-i*i)))-2),end='')
    print(c+v*( abs(-int(math.sqrt(r*r-i*i))- int(math.sqrt(r*r-i*i))) -1) +c,end='')
    print("")
    if ed:
        break
    

x=2*r-1
for k in range(int(r/3)):
    print(v*x*2)
y=int(3/2*r)+1
for m in range(y):
    print(e*int(((x)/(y))*(m)),end='')
    print(c+v*(2*(x-int(((x)/(y))*(m)))-2)+c,end='')
    print('')
