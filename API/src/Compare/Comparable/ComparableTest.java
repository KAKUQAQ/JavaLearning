package Compare.Comparable;

import Compare.Product;
import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {

    @Test
    public void test() {

        String[] arr = new String[]{"Tom", "Jerry", "Jane", "Jack", "Jill", "Rose", "Lucy"};

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        Product[] arr = new Product[5];
        arr[0] = new Product("Pro1",4829);
        arr[1] = new Product("Pro2",6657);
        arr[2] = new Product("Pro3",3333);
        arr[3] = new Product("Pro4",2451);
        arr[4] = new Product("Pro5",7651);

        Arrays.sort(arr);
        for (Product p : arr) {
            System.out.println(p);
        }
    }

}
