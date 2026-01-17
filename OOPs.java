interface Animal {
    public void walks();

}

class Horse implements Animal {
    public void walks() {
        System.out.println("Walks on 4 legs.");
    }
}

public class OOPs{
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walks();
    }
}

