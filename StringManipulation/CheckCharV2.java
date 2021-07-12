package StringManipulation;

public class CheckCharV2 {
        public static boolean checkIfPangram(String sentence) {
            int[] arr = new int[26];
//            int sentenceLength = sentence.length()
            for(char ch : sentence.toCharArray())
                arr[ch - 'a']++;
            for (int i : arr)
                if (i == 0)
                    return false;
            return true;
        }

        public static void main(String[] args) {
            String s = "qwertyuiopasdfghjklzxcvbnmtyuiop";
            System.out.print(checkIfPangram(s));
//        for (int i = 0; i <26 ; i++) {
//            System.out.print(Math.abs(i-'a') + " ");
//
//        }
        }
}
