package BitManipulation;

import java.util.Scanner;

public class checkBitRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = false;
        if(b > a){
            a = a+b;
            b = a-b;
            a = a-b;
        }
        while(a > 0){
            a = a >> 1;
            if(a == b){
                flag = true;
                break;
            }
        }
        System.out.print(flag? "Yes" : "No");
    }
}
