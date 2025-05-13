keywords = ["int","float","char","if","else","elif","for","while","return"]
operators = ["+","-","*","/","="]
delimeters = [",","(",")","[","]",";","{","}"]

code = input("Enter a line of code:\n")
tokens = code.split()

for token in tokens:
    if token in keywords:
        print(token," : Keyword")
    elif token in operators:
        print(token," : Operator")
    elif token in delimeters:
        print(token," : Delimeter")
    elif token.isdigit():
        print(token," : Number")
    else:
        print(token," : Identifier")
