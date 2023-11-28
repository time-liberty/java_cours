a = int(input())
if a >= 100:
    b = a % 10
    c = a // 100
    d = a % 100
    e = d // 10
print ( b + c + e)