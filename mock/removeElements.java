package JAVA.mock;


import java.util.*;

public class removeElements {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        int[] arr = {0,1,2,3,4,5,6};
        for (int k : arr) ll.add(k);


        int sum = 3;

//        for(int i = 0 ; i < ll.size() - 1;i++){
//            for (int j  = i + 1 ; j < ll.size() ; j++){
//                if( ll.get(i) + ll.get(j) == sum) {
//                    ll.remove(j);
//                    ll.remove(i);
//                    i--;
//                }
//
//            }
//        }


        int i = 0;
        int j = ll.size() - 1;
        while( i <= j){
            if(ll.get(i) + ll.get(j) == sum){
                ll.remove(j);
                ll.remove(i);
                j--;
            }
            j--;
        }
        System.out.print(ll);


    }
}
