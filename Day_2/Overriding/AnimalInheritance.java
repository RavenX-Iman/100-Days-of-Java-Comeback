package Day_2.Overriding;

public class AnimalInheritance {
    public static void main(String[] args) {
        
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        Animal a3 = new Cow();

        a1.makeSound(); 
        a2.makeSound(); 
        a3.makeSound(); 

        System.out.println("\nDirect Object Calls ");
        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cow cow = new Cow();
        cow.makeSound();
    }
}

class Animal {
    public void makeSound() { System.out.println("Animal makes sound"); }
}

class Cat extends Animal {
    @Override
    public void makeSound() { System.out.println("Meow"); }
}

class Dog extends Animal {
    @Override
    public void makeSound() { System.out.println("Woof"); }
}

class Cow extends Animal {
    @Override
    public void makeSound() { System.out.println("Moo"); }
}
