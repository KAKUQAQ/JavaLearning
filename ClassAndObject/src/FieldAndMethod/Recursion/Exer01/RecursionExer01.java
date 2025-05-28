package FieldAndMethod.Recursion.Exer01;

public class RecursionExer01 {
    public static void main(String[] args) {

    }
    public int f(int n) {
        if (n == 20){
            return 1;
        } else if (n == 21) {
            return 4;
        }else {
            return f(n + 2) + 2 * f(n + 1);
        }
    }

    public int func(int n) {
        if (n == 0){
            return 1;
        } else if (n == 1) {
            return 4;
        }else {
            return 2* func(n - 1) + func(n - 2);
        }
    }
}
