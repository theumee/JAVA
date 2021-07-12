package BitManipulation;

public class powerOf2 {
//    static boolean isPowerOfTwo(int x) {
//        if(x == 0)
//            return false;
//        else
//        {
//            while(x % 2 == 0)
//                x /= 2;
//            return (x == 1);
//        }
//    }


    public static void main(String[] args) {
        System.out.print(isPowerOfTwo(10));
    }

    private static boolean isPowerOfTwo(int i) {
       int x = i & (i -1);
       return x == 0;
    }
}
