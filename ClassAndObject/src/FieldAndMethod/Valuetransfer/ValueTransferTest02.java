package FieldAndMethod.Valuetransfer;

public class ValueTransferTest02 {
    public static void main(String[] args) {
        ValueTransferTest02 test = new ValueTransferTest02();

        int m = 10;
        int n = 20;

//        交换变量值
//        推荐
//        int temp = m;
//        m = n;
//        n = temp;

//        方法练习
        test.swap(m, n);

        System.out.println(m + "+" + n);
    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
