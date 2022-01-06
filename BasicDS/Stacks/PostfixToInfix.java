package BasicDS.Stacks;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "abcd^e-fgh*+^*+i-";
        String oprnds = "^+-*/";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length() ; i++){
            if(oprnds.contains("" + s.charAt(i))) {
                String tmp = "" + s.charAt(i - 2) + s.charAt(i) + s.charAt(i - 1);
                sb.append(tmp);
                s.replace("" + s.charAt(i-2) + s.charAt(i-1) + s.charAt(i), "");
                i-=4;
            }
        }
        System.out.print(sb);
    }
}
