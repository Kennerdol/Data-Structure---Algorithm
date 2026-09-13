prev1 = 0
prev2 = 1

# for fib in range(18):
#     rslt = prev1 + prev2
#     prev2 = prev1
#     prev1 = rslt
#     print(rslt)




print(0)
print(1)
count = 2

def fibonacci(prev1, prev2):
    global count
    if count <= 19:
        newFibo = prev1 + prev2
        print(newFibo)
        prev2 = prev1
        prev1 = newFibo
        count += 1
        fibonacci(prev1, prev2)
    else:
        return

print("The total number of fibonacci numbers printed is:", count)

fibonacci(1,0)
