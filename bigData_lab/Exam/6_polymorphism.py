class Shape:
    def area(self):
        pass

class Square(Shape):
    def __init__(self,side):
        self.side = side
    
    def area(self):
        return self.side * self.side
    
class Rectangle(Shape):
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
    
    def area(self):
        return self.length * self.breadth

s = Square(5)
r = Rectangle(5,10)

print("Square area: ", s.area())
print("Rectangle area: ", r.area())