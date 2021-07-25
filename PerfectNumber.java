package JAVA;

// factors(n) = n
public class PerfectNumber {
    public static void main(String[] args) {

        int n = 6;

        int sum = 1;
        for(int i = 2 ; i <= Math.sqrt(n); i++ ){
            if(n%i == 0){
                sum += i;
                if(n/i != i) // 5 * 5
                    sum += (n/i);
            }
        }
        if(sum == n)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
