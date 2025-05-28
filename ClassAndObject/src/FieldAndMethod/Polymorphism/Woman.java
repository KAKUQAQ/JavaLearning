package FieldAndMethod.Polymorphism;

public class Woman extends Person {

    boolean isBeauty;

    public void eat() {
        System.out.println("减肥");;
    }
    public void walk() {
        System.out.println("逛街");
    }

    public void goShopping() {
        System.out.println("购物");
    }
}
