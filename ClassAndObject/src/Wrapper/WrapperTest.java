package Wrapper;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void test() {

        //自动装箱
        int i1 = 10;
        Integer ii1 = i1;
        System.out.println(ii1.toString());

        Integer ii2 = i1 + 1;

        // 自动拆箱
        int i2 = ii1;

    }
}

