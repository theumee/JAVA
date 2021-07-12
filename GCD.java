import java.util.ArrayList;
import java.util.List;
public class GCD {
    public static void main(String[] args) {
        printM_SpecialGCD(9, 3);
    }
    static void printM_SpecialGCD(int N, int M) {
        List<Integer> allFactors = getAllPrimeFactors(N);
        int smallestPrime = allFactors.get(0);
        List<Integer> validatorPrimes = (N/smallestPrime)%smallestPrime == 0 ? allFactors : allFactors.subList(1, allFactors.size());
        int start = N/smallestPrime + 1;
        while (M-- > 0) {
            while (!validate(start, validatorPrimes)) {
                start++;
            }
            System.out.print(start*smallestPrime + " ");
            start++;
        }
    }
    static boolean validate(int n, List<Integer> primes) {
        for(int p: primes) {
            if(n%p == 0) return false;
        }
        return true;
    }
    static List<Integer> getAllPrimeFactors(int N) {
        int f = 2;
        List arrayList = new ArrayList<Integer>();
        while (N != 1) {
            if (N % f == 0) {
                arrayList.add(f);
                while (N % f == 0) {
                    N = N / f;
                }
            } else {
                f++;
            }
        }
        return arrayList;
    }
}