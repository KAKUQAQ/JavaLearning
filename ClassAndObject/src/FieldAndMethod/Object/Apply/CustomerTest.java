package FieldAndMethod.Object.Apply;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 22, new Account(2000));
        Customer c2 = new Customer("Tom", 22, new Account(2000));

        System.out.println(c1.equals(c2));

    }
}
