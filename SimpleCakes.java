import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCakes {
//    static int findDuplicates(
//            int[] arr, int len)
//    {
//
//        boolean ifPresent = false;
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (arr[i] == arr[j]) {
//
//                    if (al.contains(arr[i])) {
//                        break;
//                    }
//                    else {
//                        al.add(arr[i]);
//                        ifPresent = true;
//                    }
//                }
//            }
//        }
//
//        if (ifPresent) {
//            return al.size();
//        }
//        else{
//            return 0;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0 , f = 0,t;
        int[] a =  new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            c++;
        }
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = i+1 ; j < n; j++){
                if(a[i] == a[j])
                    f++;
            }
        }
        t  =  c - f;
        System.out.print(t);
    }
}
