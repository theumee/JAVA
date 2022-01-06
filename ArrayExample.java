import java.util.ArrayList;
import java.util.List;

public class ArrayExample {


    public static ArrayList<ArrayList<Integer>> sub(int[] arr,int k){
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                al.add(arr[j]);
            }
            alist.add(al);
        }
        return alist;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1,4,2,3,4};

        System.out.println(sub(arr,2));

        for (int i = 0; i < arr.length; i++) {

        }
    }
}
// create a function that will take an input of my array and a size(k);
// num = 10;
// alist.get(al.get(i)) == 10;
//