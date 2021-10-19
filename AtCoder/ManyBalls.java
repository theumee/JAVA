package JAVA.AtCoder;

import java.util.Scanner;

public class ManyBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balls = sc.nextInt();

        String str = "";

        while (balls != 0){
            if( balls % 2 == 0){
                balls /= 2;
                str += 'B';
            }
            else{
                balls -= 1;
                str += 'A';
            }
        }

        StringBuilder outputStr = new StringBuilder(str).reverse();
        System.out.print(outputStr);
    }
}
