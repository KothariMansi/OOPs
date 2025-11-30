// Inheritance

// Base Class
class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

// Sub Class
class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println(1/2 * b * h);
    }
}

// Sub Class
class EquilateralTraingle extends Triangle {
    public void area(int b, int h) {
        System.out.println(1/2 * b * h);
    }
}

// Sub Class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class OOPs{
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}

// Inheritance Type
// 1. Single Level Inheritance = Base Class -> Derived Class
// 2. Multi Level Inheritance = Base Class -> Derived Class -> Derived Class
// 3. Hierarchial Inheritance = Derived Class <- Base Class -> Derived Class
// 4. Hybrid Inheritance =  Base Class
    //                      /        \
    //          Dervide Class       Derived Class
    //                |
    //          Derived Class