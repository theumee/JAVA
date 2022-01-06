package Arrays;

public class PerfectSquareSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,12,16,20,25};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sq = (int)Math.sqrt(arr[i]);
            if(sq * sq == arr[i] ) sum+=sq;
        }

        System.out.println(sum);
    }
}
