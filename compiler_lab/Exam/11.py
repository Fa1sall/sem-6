class Node:
    def __init__(self,val,left=None,right=None):
        self.val = val
        self.left = left
        self.right = right

root = Node('=',Node('a'),Node('+',Node('b'),Node('c')))

def print_ast(node,level=0):
    if node: 
        print(" " * level + node.val)
        print_ast(node.left,level+1)
        print_ast(node.right,level+1)

count = 0

def gen_code(node):
    global count
    if not node.left and not node.right:
        return node.val
    left = gen_code(node.left)
    right = gen_code(node.right)
    temp = f't{count}'
    print(f'{temp} : {left} {node.val} {right}')
    count+=1
    return temp
    
print("\nAST:")
print_ast(root)

print("\nThree Address Code:")
gen_code(root)