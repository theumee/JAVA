package JAVA.StringManipulation;

class CheckCharacters {
    public static boolean check(String str) {
        int strlen = str.length();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            int j = 0;
            for (; j < strlen; j++) {
                if(ch == str.charAt(j)) {
                    break;
                }
            }
            if(j == strlen)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(check(str));
    }
}
