class Animal:
    def __init__(self,name):
        self.name = name
    
    def speak(self):
        return f"{self.name} makes a sound!"

class Dog(Animal):
    def speak(self):
        return "Woof Woof!"

class Cat(Animal):
    def speak(self):
        return "Meow Meow!"

dog = Dog("Asteroid Destroyer")
cat = Cat("Taco")

def animal_speak(Animal):
    print(f"{Animal.name} says {Animal.speak()}")

animal_speak(dog)
animal_speak(cat)