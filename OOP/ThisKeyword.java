package OOP;

public class ThisKeyword {
    int a;
    int b;
    public  void setData(int a, int b){
        this.a = a;         // "this" doesn't work with static variables and methods
        this.b = b;         // "this" points to variables or methods of its class
    }

    public static void main(String[] args) {

        ThisKeyword t = new ThisKeyword();
        t.setData(4,3);
        System.out.println(t.a + " " + t.b);
    }
}
