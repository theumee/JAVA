import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineup = sc.nextLine();
        boolean count = false;
            for (int i = 0; i < lineup.length() - 6; i++) {
                if (lineup.substring(i, i + 7).equals("0000000") || lineup.substring(i, i + 7).equals("1111111")) {
                    count = true;
                    break;
                }
            }
            System.out.println(count ? "YES": "NO");
        }
    }
