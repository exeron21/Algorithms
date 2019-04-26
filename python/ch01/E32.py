a = [1.4, 2, 3, 4]
b = [3, 4.1, 5.5, 1]

sum = 0.0
if len(a) != len(b):
    print ('length of two vector diff.')
else:
    length = len(a)
    for i in range(length):
        sum += a[i] * b[i]

print ('dot product of a and b is :', sum)

import numpy as np
c = np.array([[1,2],[3,2]])
d = np.array([[4,5],[3,4]])
print (np.dot(c,d))


print(c)
'''
1,2 10,13
3,2 18,23

4,5
3,4'''