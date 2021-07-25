package JAVA.SPOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class primeGenerator {


    static ArrayList<Integer> Sieve(int n) {

        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);

        arr[0] = false;
        arr[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (arr[p]) {
                for (int i = p * p; i <= n; i += p) {
                    arr[i] = false;
                }
            }
        }
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i = 2 ; i < n+1 ; i++){
            if(arr[i])
                prime.add(i);
        }
        return prime;
    }

    public static void segSieve(int a , int b){
        ArrayList<Integer> primes = Sieve((int)Math.sqrt(b));

        boolean[] isPrime = new boolean[b-a+1];


        for(int val : primes){
            int multiple = (int)Math.ceil((a * 1.0)/val);
            if(multiple == 1)
                multiple++;

            int index = multiple * val - a;
            for (int i = index; i < isPrime.length ; i+=val ){
                isPrime[i] = true;
            }

        }

        for (int i = 0 ; i < isPrime.length ; i++){
            if(!isPrime[i] && i+a > 1){
                System.out.println(i+a);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            segSieve(begin,end);
        }
    }
}
