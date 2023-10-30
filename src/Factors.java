import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Factors3(20);
    }

    //Time Complexity : O(n)
    static void Factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //Time Complexity : O(sqrt(n))
    static void Factors2(int n){
        for (int i=1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " " + n/i + " ");
            }
        }
    }

    //sorted and optimised
    static void Factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
