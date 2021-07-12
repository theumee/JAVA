package BitManipulation;

public class DecToBin {
    static void convert(int n){
        for(int i = 7 ; i >= 0; i--){
            if( (n & (1 << i )) != 0)
                System.out.print(1);
            else
                System.out.print(0);
        }
    }

    public static void main(String[] args) {
        convert(52);
    }
}
