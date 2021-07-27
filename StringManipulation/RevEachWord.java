package JAVA.StringManipulation;


//Welcome to World

public class RevEachWord {
//    static char[] revStr(char[] arr,int begin,int end){
//        int len = end - begin;
//        char[] newArr = new char[len];
//        for(int i = 0 ; i < len; i++){
//            newArr[i] =  arr[--end];
//        }
//
//        return newArr;
//    }

    public static  String rev(String str){
        int strlen = str.length();
        int begin = 0;
        int end = strlen - 1;
        int mid = (int)Math.ceil(strlen/2);
        char[] arr = str.toCharArray();

        while(begin < mid){

            char tmp;
            tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        String s = "Welcome to this Beautiful World :)";
        String str = s.trim();


       String[] arr = str.split(" ");

        for(int i = 0 ; i < arr.length; i++){
                arr[i] = rev(arr[i]);
        }
        for (String a : arr)
            System.out.print(a + " " );

//        char[] strArr= str.toCharArray();
//        String newStr = "";
//        int a = 0;
//        int b;
//        for(int  i = 0; i < len ; i++){
//           if (str.charAt(i) == ' ' || str.charAt(i) == str.charAt(len-1)){
//               if(i < len - 1)                                                        //OLD METHOD USED
        //
//                   b = i;
//               else
//                   b = len;
//               String  strTmp = new String(revStr(strArr,a,b));
//               newStr =  newStr + strTmp + " ";
//               a = i+1;
//           }
//        }
//        System.out.println(newStr.trim());
    }
}
