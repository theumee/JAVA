import java.util.*; // contains Collections framework


class GamingisLove {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long x;
        boolean swapnil = false;
        while(n2+n1 > 1){
            if(n1 > 1){
                x = n1/2;
                n1 = (int)Math.ceil((double)n1/2);
                n2 += (x/2);
                if(n1 <= 1 )
                    continue;
                swapnil =  true;
                x = n1/2;
                n1 = (int)Math.ceil((double)n1/2);
                n2 += (x/2);
                if(n1 <= 1 )
                    continue;
                swapnil = false;
            }
            else{
                x = n2/2;
                n2 = (int)Math.ceil((double)n2/2);
                n1 += (x/2);
                if(n2 <= 1 )
                    continue;
                swapnil =  true;
                x = n2/2;
                n2 = (int)Math.ceil((double)n2/2);
                n1 += (x/2);
                if(n1 <= 1 )
                    continue;
                swapnil = false;
            }
        }
        System.out.print(swapnil?"Swapnil":"Aniket");

    }
}
