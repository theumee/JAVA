import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 class ns {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0, p = 1;
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if (i % 2 != 0)
                s+=arr[i];
            else
                p*=arr[i];
        }
        System.out.print(s + " " + p);
    }
}