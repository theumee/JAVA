package JAVA.CodeSignal;

public class IsLucky {
    static boolean isLucky(int n) {
        int numberOfDigits = noOfDigits(n);
        // int i = 0;
        int sum1 = 0;
        int mid = numberOfDigits/2;
        while(numberOfDigits-- > mid){
            int m = n%10;
            sum1 += m;
            n/=10;
        }
        // i = 0;
        numberOfDigits++;
        int sum2 = 0;
        while(numberOfDigits-- > 0){
            int m = n%10;
            sum2 += m;
            n/=10;
        }
        return sum1 == sum2;
    }
    static int noOfDigits(int x){
        int count = 0;
        while(x != 0){
            count++;
            x/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(isLucky(1230));
    }
}
