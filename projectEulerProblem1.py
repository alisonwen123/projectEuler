#Project Euler problem 1

count=1
sum=0
while(count<1000):
    if (count%3==0 & count%5==0):
        sum= sum+count
    elif count%3==0 or count %5==0:
        sum= sum+count
    count = count+1
print(sum)
