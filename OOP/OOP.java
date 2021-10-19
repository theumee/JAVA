package OOP;

class pen{
    String type = "gel";
    String color = "blue";
    int point = 10;
    boolean clicked = false;

    public  void click(){
        clicked = true;
    }
    public void unClick(){
        clicked = false;
    }
}
public class OOP {
    public static void main(String[] args) {
       pen p = new pen();
        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.point);
        p.click();
        System.out.println(p.clicked);
        p.unClick();
        System.out.println(p.clicked);

    }
}
