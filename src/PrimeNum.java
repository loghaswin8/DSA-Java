public class PrimeNum {
    public static void main(String[] args) {
        int n=20;
        for (int i=1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        int c=2;
        if(n<=1){
            return false;
        }
        while (c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
