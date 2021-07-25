package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 2 5 3 2 3 5 5 5 6
// 5
public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {2,5,3,2,3,5,5,6};

        int len = arr.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : arr) {
            hm.put(i,0);
        }
        for (int i: arr) {
            int a = hm.get(i);
            hm.put(i,a+1);
        }

//        for(int i : hm.keySet()){
//            System.out.println(i+ " -- " +hm.get(i));
//        }


        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();


        for(int val: hm.keySet()){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(hm.get(val));
            al.add(val);
            aList.add(al);
        }
//        for (int i = 0 ; i < aList.size() ; i++) {

//        }

    }
}
