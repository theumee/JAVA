package JAVA.OOP.Constructor;


class Bicycle {
    int speed, gear;

    Bicycle(int a, int b) {             // parameterized Constructor
        speed = a;
        gear = b;
    }

    void show() {
        System.out.print("Speed: " + speed + " \nGear: " + gear);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        Bicycle b = new Bicycle(20, 4);

        b.show();
    }

}
