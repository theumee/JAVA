package JAVA.multiDimensionalArrays;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BooleanMatrixProblem {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        while (testCases-- > 0) {


            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][]  arr = new int[m][n];

            for(int i = 0 ; i < m ; i++)
                for(int j = 0 ;  j < n; j++)
                    arr[i][j] = sc.nextInt();

            for(int i = 0 ; i < m ; i++){
                for(int j =0 ; j < n ; j++) {
                    if (arr[i][j] == 1) {
                        for (int k = 0; k < n; k++) {
                            arr[i][k] = 1;
                        }
                        break;
                    }
                }
            }


            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ;  j < n; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }

        }

    }
}
