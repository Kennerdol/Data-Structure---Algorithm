numbers = [56, 65, 87, 9, 45, 4, 89]

ln = numbers[0]
for i in numbers:
    if i < ln:
        ln = i
print("The lowest number in the list is:", ln)