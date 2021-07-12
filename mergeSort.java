import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0){
            int length = sc.nextInt();
            int[] array = new int[length];
            for (int i = 0 ; i < length ;i++){
                array[i] = sc.nextInt();
            }
            MergeSort(array,0,length-1);
            for (int i = 0 ; i < length ;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

        static void MergeSort(int[] arr , int l, int h){
            if( l < h ){
                int m = (l + h)/2;
                MergeSort(arr,l,m);
                MergeSort(arr, m+1,h);
                Merge(arr,l,m,h);
            }

    }
        static  void Merge(int[] arr, int l , int m ,int h){

        int s1 = m - l + 1;
        int s2 = h - m;

        int[] left = new int[s1];
        int[] right = new int[s2];

        for(int i = 0 ; i < s1 ; i++)
            left[i] = arr[l + i];
        for (int  i = 0 ; i < s2 ; i++)
            right[i] = arr[m+1 + i];

        int i = 0,j = 0, k = l;
            while ( i < s1 && j < s2){
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                }
                else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }


            while(i <  s1){
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j <  s2){
                arr[k] = right[j];
                j++;
                k++;
            }

        }
}
