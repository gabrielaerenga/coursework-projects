import sys

if len(sys.argv) < 2:
    print("Error: Please provide a filename.")
    sys.exit()

filename = sys.argv[1]

count_eight = 0
digit_sum = 0

file = open(filename, "r")

for line in file:
    for ch in line.split():
        if ch == '8':
            count_eight += 1
        if ch.isdigit():
            digit_sum += int(ch)

file.close()

print("Number of '8's:", count_eight)
print("Sum of all digits:", digit_sum)
