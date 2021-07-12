import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr ={1,2,4};
        findMissingNumber(arr);
    }

     public static int findMissingNumber(int arr[]) {
        for(int i = 0; i< arr.length; i++)
            if(arr[i] != i + 1) return i + 1;
        return arr.length + 1;
    }
}