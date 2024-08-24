n = int(input())
arr = [[] for _ in range(n)]

str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

idx = 0
for i in range(n):
    for j in range(i, n):
        arr[j].append(str[idx])
        idx += 1
        idx %= 26

for a in arr:
    print(" ".join(a).rjust(n*2-1))