package recursion;

public class StepsToZero2 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(5, 4));
    }
    public static int numberOfSteps(int num1, int num2) {
        return helper(num1, num2, 0);
    }
    public static int helper(int num1, int num2, int steps){
        if (num1 == 0 || num2 == 0){
            return steps;
        }
        if (num1 >= num2) {
            num1 -= num2;
            return helper(num1, num2, steps + 1);
        } else {
            num2 -= num1;
            return helper(num1, num2, steps + 1);
        }

    }
}
