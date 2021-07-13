package JAVA.CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repitiions {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int count = 1, total = 1;
        char tmp = arr[0];
        for (int i = 1; i < arr.length ; i++) {
                if(arr[i] == tmp) {
                    count++;
                }else {
                    count = 1;
                }
                tmp = arr[i];
                if(count > total)
                    total = count;
            }
        System.out.print(total);
    }
}
