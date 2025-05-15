def factorial(n):
    if n<0:
        print("Invalid Syntax")
        return None

    while True:
        if n == 1:
            return 1
        else:
            return n * factorial(n-1)

n = int(input("Enter number to find factorial: "))
print(f"Factorial of {n} is {factorial(n)}")