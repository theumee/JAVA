package OOP.NS;

public class Car {
    public char color;
    public String model;
    public double topSpeed;
    

    public Car(char color,String model, double topSpeed){
        this.color = color;
        this.model = model;
        this.topSpeed = topSpeed;
    }
    public void startCar() {
        System.out.println(model  + " is Started and its top-speed is " + topSpeed);
    }
}
