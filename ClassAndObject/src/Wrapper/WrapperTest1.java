package Wrapper;

import org.junit.Test;

public class WrapperTest1 {

    @Test
    public void test1() {
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);

        boolean b1 = true;
        String str2 = String.valueOf(b1);

        String str3 = i1 + " ";
        String str4 = b1 + " ";
    }

    @Test
    public void test2() {
        // 调用包装类静态方法 String ---> 基本数据类型
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 10);
    }
}
