filename = input("Enter file name: ")
with open(f"{filename}.txt","w") as file:
    print("Enter contents of the file (end to terminate): ")
    while True:
        line = input()
        if(line.lower()=="end"):
            break
        else:
            file.write(line + "\n")
    print("Writing Operation Completed Successfully")