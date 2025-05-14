def optimize_code(code):
    optimized = []
    seen = {}

    for line in code:
        parts = line.split()

        # Constant folding: e.g. t3 = 4 + 5
        if len(parts) == 5 and parts[2].isdigit() and parts[4].isdigit():
            result = eval(f"{parts[2]} {parts[3]} {parts[4]}")
            new_line = f"{parts[0]} = {result}"
            seen[parts[0]] = str(result)
            optimized.append(new_line)

        # Value propagation: e.g. t4 = t3
        elif len(parts) == 3 and parts[2] in seen:
            new_line = f"{parts[0]} = {seen[parts[2]]}"
            seen[parts[0]] = seen[parts[2]]
            optimized.append(new_line)

        # Replace known variables inside expressions: e.g. t5 = t2 + t4
        elif len(parts) == 5:
            op1 = seen.get(parts[2], parts[2])
            op2 = seen.get(parts[4], parts[4])
            if op1.isdigit() and op2.isdigit():
                result = eval(f"{op1} {parts[3]} {op2}")
                new_line = f"{parts[0]} = {result}"
                seen[parts[0]] = str(result)
            else:
                new_line = f"{parts[0]} = {op1} {parts[3]} {op2}"
                seen[parts[0]] = new_line.split(" = ")[1]
            optimized.append(new_line)

        else:
            optimized.append(line)

    # Optional: Remove duplicate assignments like t2 = t1 followed by t1 = t2
    final = []
    for i in range(len(optimized)):
        if i > 0 and optimized[i] == optimized[i-1]:
            continue
        final.append(optimized[i])

    return final

# Example code
code = [
    "t1 = t2 + t3",
    "t2 = t1",
    "t3 = 4 + 5",
    "t4 = t3",
    "t5 = t2 + t4"
]

print("Original Code:")
for c in code:
    print(c)

print("\nOptimized Code:")
opt = optimize_code(code)
for c in opt:
    print(c)
