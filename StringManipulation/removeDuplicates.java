package StringManipulation;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class removeDuplicates {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();
		
		while(testCases-- > 0){
			String ans = "";
			int arr[] = new int[26];
			String originalStr = sc.next();
			int strlen = originalStr.length();
			for(int i = 0 ; i < strlen; i++){
				char ch = originalStr.charAt(i);
				int index = ch - 97;
				int freq = arr[index];
				if(freq == 0){
					ans += ch;
					arr[index] = 1;
				}
			}
			System.out.println(ans);

		}
	}
}