package JAVA.CodeSignal;

public class AlmostIncreasingSequence {
    static boolean almostIncreasingSequence(int[] sequence) {
        int len = sequence.length;
        if(len <= 2) return true;
        int flag = 0;
        for(int  i = 0 ; i < len - 1 ; i++){
            if(sequence[i] >= sequence[i+1]){
                flag++;
                boolean skip     = i+2 < len && sequence[i] < sequence[i+2];
                boolean skipBack = i-1 >= 0  && sequence[i-1] < sequence[i+1];
                if(skip && skipBack || flag == 2 ) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,6};
        System.out.print(almostIncreasingSequence(arr));
    }

}
