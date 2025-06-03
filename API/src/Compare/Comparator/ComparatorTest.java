package Compare.Comparator;

import Compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

    @Test
    public void test() {
        Product[] arr = new Product[5];
        arr[0] = new Product("Pro1",4829);
        arr[1] = new Product("Pro2",6657);
        arr[2] = new Product("Pro3",3333);
        arr[3] = new Product("Pro4",2451);
        arr[4] = new Product("Pro5",7651);

        // 创建一个实现了Comparator接口的实现类的对象
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product)o1;
                    Product p2 = (Product)o2;

                    return -Double.compare(p1.getPrice(), p2.getPrice());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Comparator comparator2 = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product)o1;
                    Product p2 = (Product)o2;
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        Arrays.sort(arr, comparator1);

        for (Product p : arr) {
            System.out.println(p);
        }
    }
}
