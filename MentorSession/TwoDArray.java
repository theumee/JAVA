package JAVA.MentorSession;


// {{1,2,3,4,5},
// {12,1,4},
// {1,2,5,6,8,9},
// {},
// {1}}
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4,5}, {12,1,4}, {1,2,5,6,8,9}, {}, {1}};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " " );
            System.out.println();
        }
    }
}
