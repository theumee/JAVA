import java.util.Scanner;

public class Ateam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num;
        int count = 0, flag = 0 ;
        for (int i = 0; i < len ; i++){
            for (int j = 0 ; j < 3 ; j++ ){
                num = sc.nextInt();
                if(num == 1)
                    flag++;
            }
            if (flag > 1)
                count++;
            flag = 0;
        }
        System.out.print(count);
    }

}
