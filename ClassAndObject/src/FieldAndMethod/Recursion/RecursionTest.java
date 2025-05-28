package FieldAndMethod.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));
        System.out.println(test.getMul(5));
    }
//    1-100自然数总和
    public int getSum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num){
        if(num == 1){
            return 1;
        }
        return num + getSum1(num - 1);
//        else {
//            return getSum1(num - 1) + num;
//        }
    }

//    n的阶乘
    public int getMul(int n){
        if(n == 1){
            return 1;
        }
        return getMul(n-1) * n;
    }

//    快速排序

//    汉诺塔游戏

//    斐波那契数列
    public int getF(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else {
            return getF(n-1) + getF(n-2);
        }
    }

//




//    无限递归
//    public void method1() {
//        System.out.println("method1()....");
//        method1();
//    }
}
