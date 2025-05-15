def linear_search(arr,target):
    for i in range(len(arr)):
        if arr[i]==target:
            return i
    return -1

print("---Linear Search---")
arr = [10,20,30,40,50]
print("Array: " , arr)
target = int(input("Enter number to search: "))
result = linear_search(arr,target)
if result != -1:
    print(f"{target} found at index {result}")
else:
    print(f"{target} not found in array")