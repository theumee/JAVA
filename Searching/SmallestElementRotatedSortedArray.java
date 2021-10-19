package JAVA.Searching;

public class SmallestElementRotatedSortedArray {
    static  int findSmallest(int[] nums){
        if(nums.length == 0 ) return -1;
        if(nums.length == 1) return nums[0];
        int left = 0 ;
        int right  = nums.length - 1;

        while (left < right){
            int mid  = left + (right - left )/2;
            if(nums[mid] > nums[right])
                left = mid+1;
            else
                right = mid;
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr = {3,3,1,3};
        System.out.print(findSmallest(arr));
    }
}
