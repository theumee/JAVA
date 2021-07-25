package JAVA.Leetcode;

class dup {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int i = 0;
        int index = 1;
        while(i < len-1 ){
            if(nums[i] != nums[i+1] ){
                nums[index++] = nums[i+1];
            }
            i++;
        }
        return index;
    }
}
public class RemoveInPlaceDuplicates {
    public static void main(String[] args) {
        dup d = new dup();
        int[] arr = {5,2,2,2,5,5,5,4,3,3,3,2,1,1};
        System.out.println(d.removeDuplicates(arr));
        System.out.print("[");
        for(int val: arr)
            System.out.print(val +",");
        System.out.print("]");
    }
}
