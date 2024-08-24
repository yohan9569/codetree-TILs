arr = [*map(int,input().split())]
s = sum(arr)
m = int(s / len(arr))
print(s)
print(m)
print(s-m)