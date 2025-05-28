package FieldAndMethod.Polymorphism;

public class PersonTest01 {
    public static void main(String[] args) {
        Person p1 = new Man();

        Man m1 = (Man) p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        Person p2 = new Woman();
        // instanceof判断是否可以转型
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.earnMoney();
        }
    }
}
