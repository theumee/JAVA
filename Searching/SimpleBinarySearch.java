package JAVA.Searching;

public class SimpleBinarySearch {
    static int findELement(int[] arr,int n){
        int start = 0 ;
        int end  = arr.length -1;
        while ( start <= end){
            int mid = start + (end - start)/2;
            if(n == arr[mid]) return mid;
            if(n > arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,4,5,6,9,11,12,13,17};
        int element = 13;
        System.out.print(findELement(arr, element));
    }
}
