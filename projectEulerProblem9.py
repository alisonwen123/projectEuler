#Project Euler Problem 9

total=1000
multiple= 1
for a in range(1, total):
    for b in range(1, total-1):
        c= total-a-b
        if (a**2+b**2)==c**2:
            multiple= a*b*c
print(multiple)




