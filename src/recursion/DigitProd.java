package recursion;

public class DigitProd {
    public static void main(String[] args) {
        int n = 53;
        System.out.println(prod(n));
    }
    static int prod(int n) {
        if (n%10==n){
            return n;
        }
        return n%10 * prod(n/10);
    }
}
