with open("input.txt","r") as file:
    text = file.read()
    lines = text.splitlines()
    words = text.split()

    print("Char: ", len(text))
    print("Words: ", len(words))
    print("Lines: ", len(lines))