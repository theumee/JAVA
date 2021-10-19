package JAVA;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class test4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            ArrayList<Integer> li = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                al.add(sc.nextInt());
            }
            Collections.sort(al);
            int count = 0;
            int total = 0;
            for(int i = 0 ; i < n ; i++){
                if(al.get(i) <= k && count <= k){
                    total = 1;
                    li.add(al.get(i));
                    count++;
                }
                else if(al.get(i) > k && !li.contains(al.get(i))) {
                    li.add(al.get(i));
                    total++;
                }
            }

            System.out.println(total);
        }
    }
}