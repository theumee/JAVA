package StringManipulation;

class CheckCharacters {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        int strlen = str.length();
        for (int j = 0; j < 26; j++) {
            char ch = (char)('a' + j);
            for (int i = 0; i < strlen; i++) {
                if(str.charAt(i) == ch)
                    break;

            }
        }
    }
}
