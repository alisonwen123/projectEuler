#Project Euler Problem 3


number=600851475143
i=1
while i*i<number:
    if(number%i==0):
        number = number/i
    i = i+1
print(number)
