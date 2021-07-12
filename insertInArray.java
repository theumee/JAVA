import java.util.ArrayList;
import java.util.Scanner;

public class insertInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while ( testcases-- > 0) {
            int length = sc.nextInt();
            int element = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                array.add(sc.nextInt());
            }
            array.add(element);
            System.out.println();
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}