import java.util.Scanner;

public class dir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (y2 > y1 )
            System.out.print("North ");
        else if( y1 > y2 )
            System.out.print("South ");
        if (x2 > x1 )
            System.out.print("East");
        else if (x1 > x2)
            System.out.println("West");

    }
}
