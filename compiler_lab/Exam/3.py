print("Enter first string: ")
s1 = input()

print("Enter second string: ")
s2 = input()

# 1 - Length Operation
length_s1 = 0
for _ in s1:
    length_s1+=1
print("Length of String 1: ",length_s1)

length_s2 = 0
for _ in s2:
    length_s2+=1
print("Length of String 2: ",length_s2)

#2 - Copy Operation
copy_s1 = ""
for ch in s1:
    copy_s1+=ch
print("Copied String 1: ",copy_s1)

#3 - Equality Check
equal = True
if len(s1) != len(s2):
    equal = False
else:
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            equal = False
            break

print("String 1 is equal to String 2 ===> ",equal)

#4 - Concatenation
concat = ""
for ch in s1:
    concat+=ch
for ch in s2:
    concat+=ch
print("Concatenated String: ",concat)

#5 - Reversal
rev_s1 = ""
for ch in s1:
    rev_s1 = ch + rev_s1
print("String 1: ",s1)
print("Reversed String 1: ",rev_s1)

rev_s2 = ""
for ch in s2:
    rev_s2 = ch + rev_s2
print("String 1: ",s2)
print("Reversed String 1: ",rev_s2)