filename = input("Enter the filename (with .txt extension): ")

with open(filename, "w") as file:
    print("\nEnter contents of the file. Type 'end' to stop:")

    while True:
        line = input() 
        if line.lower() == "end": 
            break
        file.write(line + "\n") 

print(f"\nFile '{filename}' has been created successfully!")
