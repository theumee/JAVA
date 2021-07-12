import java.util.Scanner;

class arrary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean isStrict = true;
        int lastInt =1;
        sc.nextInt();
        for(int i=1;i<n;i++){
            int x = sc.nextInt();
            if (lastInt >= x){
                isStrict =false;
                break;
            }
            for (int j =lastInt+1; j<=x; j++){
                if (x%j == 0){
                    lastInt =j;
                    break;
                }
            }
        }
        System.out.println(isStrict? "YES": "NO");
    }
}
