package JAVA.StringManipulation;


//Welcome to World

public class RevEachWord {
    static char[] revStr(char[] arr,int begin,int end){
        int len = end - begin;
        char[] newArr = new char[len];
        for(int i = 0 ; i < len; i++){
            newArr[i] =  arr[--end];
        }
//        int i = 0;
//        int j = len-1;
//        int mid = (len/2)+1;
//        while(i < mid){
//            char tmp = newArr[i];
//            newArr[i]= newArr[j];
//            newArr[j] = tmp;
//            i++;
//            j--;
//        }
        return newArr;
    }
    public static void main(String[] args) {
        String s = "welcome to My HumBle HOME 109";
        String str = s.trim();

        int len  = str.length();

        char[] strArr= str.toCharArray();
        String newStr = "";
        int a = 0;
        int b;
        for(int  i = 0; i < len ; i++){
           if (str.charAt(i) == ' ' || str.charAt(i) == str.charAt(len-1)){
               if(i < len - 1)
                   b = i;
               else
                   b = len;
               String  strTmp = new String(revStr(strArr,a,b));
               newStr =  newStr + strTmp + " ";
               a = i+1;
           }
        }
        System.out.println(newStr.trim());
    }
}
