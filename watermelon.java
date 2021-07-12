import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2  ; i < n ; i+=2 ){
            for (int j = 2 ; j < n ; j+=2)
                if(i+j == n) {
                    c = 1;
                    break;
                }
        }
        System.out.println( c==1 ? "YES":"NO" );
    }
}
