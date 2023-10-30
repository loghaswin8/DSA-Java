package recursion;
public class CountZero {
    public static void main(String[] args) {
        long n = 30204;
        System.out.println(count(n, 0));
    }
    static int count (long n, int c) {
        if (n < 1) {
            return c;
        }
        long rem = n % 10;
        if (rem % 10 == 0) {
           c = c + 1;
        }
        return count(n/10, c);
    }
}
