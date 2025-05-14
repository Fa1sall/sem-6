class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

# a = b + c * d
root = Node('=', Node('a'), Node('+', Node('b'), Node('*', Node('c'), Node('d'))))
temp_count = 1 

def generate_code(node):
    global temp_count
    if node is None:
        return ""
    
    # For assignment
    if node.val == '=':
        right_code = generate_code(node.right)
        print(f"MOV {node.left.val}, {right_code}")
    
    # For addition
    elif node.val == '+':
        left_code = generate_code(node.left)
        right_code = generate_code(node.right)
        temp_var = f"t{temp_count}"
        print(f"ADD {temp_var}, {left_code}, {right_code}")
        temp_count += 1
        return temp_var
    
    # For subtraction
    elif node.val == '-':
        left_code = generate_code(node.left)
        right_code = generate_code(node.right)
        temp_var = f"t{temp_count}"
        print(f"SUB {temp_var}, {left_code}, {right_code}")
        temp_count += 1
        return temp_var
    
    # For multiplication
    elif node.val == '*':
        left_code = generate_code(node.left)
        right_code = generate_code(node.right)
        temp_var = f"t{temp_count}"
        print(f"MUL {temp_var}, {left_code}, {right_code}")
        temp_count += 1
        return temp_var
    
    # For division
    elif node.val == '/':
        left_code = generate_code(node.left)
        right_code = generate_code(node.right)
        temp_var = f"t{temp_count}"
        print(f"DIV {temp_var}, {left_code}, {right_code}")
        temp_count += 1
        return temp_var
    
    # For constants or variables (leaf nodes)
    else:
        return node.val

print("Generated Assembly Code:")
generate_code(root)
