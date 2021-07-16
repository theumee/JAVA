package JAVA.Leetcode;


class S3 {
    public int mySqrt(int x) {
        for(int i = 0 ; i <= x/2;i++){
            if(i*i == x)
                return i;
            if(i*i > x)
                return i-1;
        }
        return 0;
    }
}
public class Sqrt {
    public static void main(String[] args) {
        S3 s = new S3();

        System.out.println(s.mySqrt(2147483647));
    }
}
