// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ans = coins(3);
        System.out.println(ans);
    }
    static int coins(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += (int) Math.pow(i, 2);
        }
        return total;
    }

}