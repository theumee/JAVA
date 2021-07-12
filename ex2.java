public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int element = 7;
        for (int i = 0; i < 5 ; i++ ){
            if (arr[i] == element) {
                System.out.println("YES " + i);
                return;
            }
        }
        System.out.println("NO " + "-1");
    }
}
