import java.util.*;

class hanoi
{
    static void Hanoi(int n, char A,
                             char C, char B)
    {
        if (n == 1)
        {
            System.out.println(n+":"+A+"->"+C);
            return;
        }
        Hanoi(n - 1, A, B, C);
        System.out.println(n + ":" + A +"->" + C );
        Hanoi(n - 1, B, C, A);
    }

    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hanoi(n, 'A', 'C', 'B');
    }
}
 