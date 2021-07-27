package JAVA.careercup;

public class CountNumberOfTwos {
    public static int countTwos(int n){
        int count = 0;
        while (n > 0) {
            int a = n % 10;
            if( a == 2 )
                count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 222;
        int counter = 0;
        for(int i = 2 ; i < n ; i++ )
            counter += countTwos(i);
        System.out.print(counter);
    }
}
