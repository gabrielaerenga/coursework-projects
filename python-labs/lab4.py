import sys

A = []

def sort205(p, r):
    if p < r:
        q = divide(p, r)
        sort205(p, q - 1)
        sort205(q + 1, r)

def divide(p, r):
    x = A[r]
    i = p - 1
    for j in range(p, r):
        if A[j] <= x:
            i += 1
            A[i], A[j] = A[j], A[i]
    A[i + 1], A[r] = A[r], A[i + 1]
    return i + 1

# main program #

filename = sys.argv[1]

with open(filename) as file:
    for line in file:
        A.append(int(line.strip()))

sort205(0, len(A) - 1)

for num in A:
    print(num)
