package BitManipulation;

public class GameTime {
    static long countOnes(long num) {
        long count = 0;
        while(num > 0){
            num = num & (num-1);
            count++;
        }
        return count;
    }
    static long countZeroes(long num) {
        long count = 0;
        while(num > 0){
            num = num & (num-1);
            count++;
        }
        return count;
    }
}
