package MOD;

public class factMOD {
    public static void main(String[] args) {
        int n = 1000;
        int MOD = 1000000000 + 7;
        int ans = 1;
        for(int i = 1 ; i <= n; i++){
            ans = (ans * i) % MOD;
        }
        System.out.println(ans);
    }
}
