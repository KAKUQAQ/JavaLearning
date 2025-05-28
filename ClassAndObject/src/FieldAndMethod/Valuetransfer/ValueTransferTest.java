package FieldAndMethod.Valuetransfer;

public class ValueTransferTest {
    public static void main(String[] args) {

//        基本数据类型
        int m = 10;
        int n = m; //传递数据值
        System.out.println(m + "+" + n);
        m++;
        System.out.println(m + "-" + n);

//        引用数据类型
//        数组
        int [] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = arr1;

        arr2[0] = 10;
        System.out.println(arr1[0]);

//        对象
        Order order1 = new Order();
        order1.orderId = 1;
        Order order2 = order1;
        order2.orderId = 2;
        System.out.println(order1.orderId);
    }
}

class Order{
    int orderId;
        }
