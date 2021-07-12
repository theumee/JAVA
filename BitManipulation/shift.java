package BitManipulation;

public class shift {
    public static void main(String[] args) {
        long x = 13; // 5 = 101
//        long y = Long.MAX_VALUE;
//        int a = s >> 1; // 101 >> 1 = 010 , 010 >> 1 = 001
//        System.out.println(a); // 10
//        int b = s << 1;
//        System.out.println(b); // 1010
//        System.out.println(a | b); // 1010
        long a = x * (long)Math.pow(2,2);
        long b =  x << 2;
        long c =  x >> 2;
        long d = x/(long)Math.pow(2,2);
        System.out.println(a );
        System.out.println(b);
        System.out.println(c);
        System.out.println( d);

    }
}
