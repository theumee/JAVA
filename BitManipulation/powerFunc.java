package BitManipulation;

public class powerFunc {
    static long MOD = 1000000007;
    static long power(long a, long b){
        if(b == 0)
            return 1;
//        if(b == 1)
//            return a; // not necessary
        long tmp = power(a, b/2 );
        long result = (tmp * tmp) % MOD;
        if(b % 2 == 1)
            result = (result * a) % MOD;
        return result;
    }

//    static long pow(long a , long b){
//        if(b==1)
//            return a;
//        return a * pow(a,b-1);
//    }

    public static void main(String[] args) {


        long start = System.currentTimeMillis();

        System.out.println(power(2,100));

        long end = System.currentTimeMillis();

        System.out.println("Time Taken --> "+ (end - start) + "ms");

        start = System.currentTimeMillis();

        System.out.println((long)Math.pow(2,100) % MOD );

        end = System.currentTimeMillis();

        System.out.println("Time Taken --> "+ (end - start) + "ms");

//        start = System.currentTimeMillis();
//
//        System.out.println(pow(2,34));
//
//        end = System.currentTimeMillis();
//
//        System.out.println("Time Taken --> "+ (end - start) + "ms");


    }
}
