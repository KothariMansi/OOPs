abstract class Animal {
    Animal() {
        System.out.println("You are creatig a new Animal....");
    }
    abstract void walk();
    public void eats() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Created.");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPs{
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.eats();

    }
}

