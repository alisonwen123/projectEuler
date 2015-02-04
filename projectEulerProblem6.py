#Project Euler Problem 6

sum1=0
sum2=0
i=1
while (i <=100):
    sum1= sum1 +(i*i)
    sum2= sum2+i
    i+=1
sum2= (sum2)**2
print(sum2-sum1)



