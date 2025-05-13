class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "Animal makes a sound"

class Dog(Animal):
    def speak(self):
        return "Woof Woof"

class Cat(Animal):
    def speak(self):
        return "Meow Meow"

dog = Dog("Buddy")
cat = Cat("Whiskers")

print(f"{dog.name} says: {dog.speak()}")
print(f"{cat.name} says: {cat.speak()}") 
