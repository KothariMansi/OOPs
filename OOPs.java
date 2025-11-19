class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Something is writing...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("contructor called");
    }
}

public class OOPs{
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ball Pen";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gel Pen";
        pen1.printColor();
        pen2.printColor();

        Student student1 = new Student("Ram", 23);
        student1.printInfo();

    }
}