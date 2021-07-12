package Arrays;

public class findDuplicates{
    static int findDup(int[] arr){
        int tortoise = arr[0];
        int hare  = arr[0];
        while(true){
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
            if(tortoise == hare)
                break;
        }
        int ptr1 = arr[0];
        int ptr2 = tortoise;
        while(ptr1 != ptr2){
            ptr1 = arr[ptr1];
            ptr2 = arr[ptr2];
        }
        return ptr1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.print(arr);
    }
}
