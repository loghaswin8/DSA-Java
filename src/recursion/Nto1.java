package recursion;

public class Nto1 {
    public static void main(String[] args) {
        funcPass(5);
    }
    //concept passing
    static void funcPass(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n + " ");
        funcPass(--n);
    }
    static void func(int n) {
        if (n==0) {
            return;
        }
        System.out.print(n + " ");
        func(n-1);
    }

    static void funcRev(int n) {
        if (n==0) {
            return;
        }
        funcRev(n-1);
        System.out.print(n + " ");
    }
}
