#Project Euler Problem 4

maximum = 0;
for a in range (100, 1000):
    for b in range (100, 1000):
        product = a*b
        if (product > maximum) and str(product)==(str(product)[::-1]):
            maximum=product
print (maximum)

