package OOP.Constructor;

class Shirt {
    String color;
    char size;

    Shirt(){}     //empty shirt() is still default constructor

    Shirt(String newColor,char newSize){
        color = newColor;
        size = newSize;

    }
    public void putOn(){
        System.out.println("Shirt On");
    }
    public void takeOff(){
        System.out.println("Shirt Off");
    }

}
class Main{
    public static void main(String[] args) {
        Shirt s = new Shirt();      // Here shirt() is default constructor if not present in shirt class.
        s.putOn();
        s.takeOff();
        s.color = "blue";
        s.size  = 'M';
        System.out.println(s.size + " " + s.color);
        Shirt s2 = new Shirt("white",'L'); //parametrized constructor
        System.out.println(s2.color+ " "+ s2.size);
    }
}
