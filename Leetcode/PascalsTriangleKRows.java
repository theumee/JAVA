package JAVA.Leetcode;

import java.util.*;


class S4 {
//    static int fact(int n){
//        if(n < 2)
//            return 1;
//        int fact = 1;
//        for(int i = n ; i > 1 ; i--){
//            fact *= i;
//        }
//        return fact;
//    }
    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> lili = new ArrayList<>();
//
//        int[] arr = {1,2,4};
//        int j = 0;
//        while( j < numRows) {
//            List<Integer> li = new ArrayList<>();
//            for (int i = 0; i <= j; i++) {
//                int comb = fact(j) / (fact(i) * fact(j - i));
//                li.add(comb);
//            }
//            lili.add(li);
//        }
//        return lili;

        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0 ) return triangle;
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);

            for(int j = 1 ; j < i; j++){
                curr_row.add(prev_row.get(j-1) + prev_row.get(j));
            }

            curr_row.add(1);
            triangle.add(curr_row);
        }

        return triangle;
    }
}
public class PascalsTriangleKRows {
    public static void main(String[] args) {
        S4 s = new S4();
        System.out.print(s.generate(5));
    }
}


//[[1]
//[1,1],
//[1,2,1],
//[1,3,3,1],
//[1,4,6,4,1],
//[1,5,10,10,5,1],
//[1,6,15,20,15,6,1]
//[1,7,21,35,35,21,7,1],
//[1,8,28,56,70,56,28,8,1],
//[1,9,36,84,126,126,84,36,9,1],
//[1,10,45,120,210,252,210,120,45,10,1],
//[1,11,55,165,330,462,462,330,165,55,11,1]
//[1,12,66,220,495,792,924,792,495,220,66,12,1],
//[1,13,78,286,715,1287,1716,1716,1287,715,286,78,13,1],
//[1,14,91,364,1001,2002,3003,3432,3003,2002,1001,364,91,14,1]]

// [[1],
// [1,1],
// [1,2,1],
// [1,3,3,1],
// [1,4,6,4,1],
// [1,5,10,10,5,1],
// [1,6,15,20,15,6,1],
// [1,7,21,35,35,21,7,1],
// [1,8,28,56,70,56,28,8,1],
// [1,9,36,84,126,126,84,36,9,1],
// [1,10,45,120,210,252,210,120,45,10,1],
// [1,11,55,165,330,462,462,330,165,55,11,1],
// [1,12,66,220,495,792,924,792,495,220,66,12,1],
// [1,4,24,88,221,399,532,532,399,221,88,24,4,1],
// [1,0,1,5,14,29,44,50,44,29,14,5,1,0,1]]