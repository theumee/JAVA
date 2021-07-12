package BitManipulation;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 ,7, 5,1,2};
        int XORresult = 0;
        for (int i: arr) {
            XORresult = XORresult^i;
        }
        System.out.print(XORresult);
    }
}
