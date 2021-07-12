package JAVA.Leetcode;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        for(int i = 0 ; i < nums.length ;i++){
            for(int j = nums.length-1 ; j > i; j-- ){
                if(nums[i] == val && nums[j] != val){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        // if(nums.length > 0){
        //     if(nums.length-1 == 0 )
        //         if(nums[0] == val)
        //             return nums.length-1;
        //         else
        //             return nums.length;
        //     return (nums.length-1) - count;
        // }
        // return 0;
        if(nums.length > 0){
            int flag = 0;
            for(int n: nums){
                if(n != val)
                    flag++;
            }
            return flag;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr,2));
        for(int a: arr)
            System.out.print(a + " ");
    }
}
