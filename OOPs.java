// Polymorphism
// Function overloading
// Compile time polymorphism
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);

    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OOPs{
    public static void main(String args[]) {
        Student student1 = new Student();
        student1.name = "Ram";
        student1.age = 12;
        student1.printInfo(student1.name);
        student1.printInfo(student1.name, student1.age);
    }
}