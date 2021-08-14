package JAVA.CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class MatrixElementSum {
    static int matrixElementsSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        List<Integer> li= new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(i == 0 )
                    count += matrix[i][j];
                else if(!li.contains(j))     // if li contains the index of current column then we skip to add the current element
                    count += matrix[i][j];
                if(matrix[i][j] == 0)    // Check if any column contains the 0 add that column index to the list (li)
                    li.add(j);
            }
        }
        return  count;
    }

    public static void main(String[] args){
        int[][] arr = { {1,1,1,0},
                        {0,5,0,1},
                        {2,1,3,10}};
        System.out.print(matrixElementsSum(arr));
    }

}
