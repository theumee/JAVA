package JAVA.OOP.Inheritence;


class parent{
    int a , b ;                     //these variables are public. Private variables  are not inherited.

     void setab(int i, int j){
        a = i;
        b = j;
    }
}

class child extends parent{
    int c;
    void setc(int k){
        c = k;
    }
    void displaySum(){
        System.out.print(a + b + c);
    }
}
public class InheritenceExample {
    public static void main(String[] args) {
        child obj = new child();

        obj.a = 13; obj.b = 29 ;  // we can also use this obj.setab(13,29);
        obj.c = 47;              //obj.setc(47);

        obj.displaySum();
    }
}
