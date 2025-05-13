vowels = "aeiouAEIOU"
v_count = c_count = 0

with open("input.txt","r") as file:
    text = file.read()

    for ch in text:
        if ch.isalpha():
            if ch in vowels:
                v_count+=1
            else:
                c_count+=1
    
print("Vowel Count: ",v_count)
print("Consonant Count: ",c_count)