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
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {}
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

        Student student1 = new Student();
        student1.name = "Ram";
        student1.age = 12;

        Student student2 = new Student(student1);
        student2.printInfo();

    }
}