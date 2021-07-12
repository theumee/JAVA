import java.util.Scanner;

public class wayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        char first,second;
        String[] arr = new String[len];
        for (int i = 0 ; i < len ; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > 10) {
                first = arr[i].charAt(0);
                second = arr[i].charAt(arr[i].length()-1);
               arr[i] = String.valueOf(first) + (arr[i].length() - 2) + String.valueOf(second);
            }
        }
        for (int i = 0; i < len ; i++){
            System.out.println(arr[i]);
        }
    }
}

