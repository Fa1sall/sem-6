def binary_search(arr,target):
    low, high=0, len(arr)-1

    while low < high:
        mid = low+high//2

        if arr[mid]==target:
            return mid
        elif target>arr[mid]:
            low = mid + 1
        elif target<arr[mid]:
            high = mid - 1
    return -1

print("----Binary Search----")
arr = [10,20,30,40,50]
print("Array: " , arr)
target = int(input("Enter number to search: "))
result = binary_search(arr,target)
if result != -1:
    print(f"{target} found at index {result}")
else:
    print(f"{target} not found in array")