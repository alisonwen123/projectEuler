#Project Euler Problem 2
n=4000000
sum=0
fib=1
fib2=2
while (fib2<n):
    tempNum=fib2
    if fib2%2==0:
        sum= sum+fib2
    fib2= fib2 + fib
    fib = tempNum
print(sum)
