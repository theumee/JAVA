//package Leetcode;
//
//public class MergeTwoArrays {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] merged = new int[n+m];
//        int i = 0;
//        int j = 0;
//        int index = 0;
//        while(index < merged.length ){
//            if(nums1[i] < m && nums2[j] < n && nums1[i]){
//                merged[index++] = nums1[i++];
//            }else{
//                merged[index++] = nums2[j++];
//            }
//        }
//        System.out.println(merged);
//
//    }
//    public static void main(String[] args) {
//        merge(new int[]{1,2,3,4},4, new int[]{4, 5, 6, 7},4);
//
//    }
//
//}
