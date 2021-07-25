package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BooleanMatrix {
    public static void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int t = Integer.parseInt(br.readLine());

        // bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")

        while (t-- > 0) {
            int m = Integer.parseInt(br.readLine().trim());
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1) {
                        for (int k = 0; k < n; k++) {
                            arr[i][k] = 1;
                        }
                        break;
                    }
                }
            }
            for(int i = 0 ; i < m ; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
}
