package JAVA.Leetcode;


class S3 {
    public int mySqrt(int x) {
        if(x < 4 && x > 0)
            return 1;

        for(int i = 2 ;  i <= (x/2)+1 ; i++){
            if(i*i == x)
                return i;
            if(i*i > x || i*i < 0)
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
