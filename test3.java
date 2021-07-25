package JAVA;

public class test3 {
    public static void main(String[] args) {
//        int m = Integer.parseInt(String.valueOf(15),2);
//
//        System.out.println(m);
        int[] arr = {1,2,9};
        int[] arr2 = new int[4];
        arr2 = arr;
        System.out.println(arr2.length);
        for (int i = 0 ; i < arr2.length ; i++)
            System.out.print(arr2[i] + " ");
    }
}
