package FieldAndMethod.Test01;

public class KidsTest {
    public static void main(String[] args) {
        Kids k = new Kids();

        k.setSex(1);
        k.setSalary(0);
        k.setYearsOld(12);

        k.employed();
        k.manOrWomen();
        k.printAge();
    }
}
