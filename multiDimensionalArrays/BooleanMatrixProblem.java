package JAVA.multiDimensionalArrays;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BooleanMatrixProblem {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        while (testCases-- > 0){

            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][]  arr = new int[m][n];

            for(int i = 0 ; i < m ; i++)
                for(int j = 0 ;  j < n; j++)
                    arr[i][j] = sc.nextInt();

            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0 ; i < m ; i++){
                for(int j =0 ; j < n ; j++){
                    if(arr[i][j] == 1){
                        al.add(i);
                        break;
                    }
                }
            }
            int len = al.size();
            int index = 0;
            while(index < len){
                for(int j = 0 ; j < n ; j++ ){
                    arr[al.get(index)][j] = 1;
                }
                index++;
            }


            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ;  j < n; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }

        }

    }
}