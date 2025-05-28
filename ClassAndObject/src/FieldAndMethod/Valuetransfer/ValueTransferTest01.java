package FieldAndMethod.Valuetransfer;

import Test02.Person;

public class ValueTransferTest01 {
    public static void main(String[] args) {

        ValueTransferTest01 test = new ValueTransferTest01();
//        基本数据类型
        int m = 10;

        test.method01(m);

        System.out.println(m);

//        引用数据类型
        Person p = new Person();
        p.age = 10;
        test.method02(p);
        System.out.println(p.age);
    }

    public void method01(int m) {
        m++;
//        System.out.println(m);
    }

    public void method02(Person p) {
        p.age++;
    }
}
