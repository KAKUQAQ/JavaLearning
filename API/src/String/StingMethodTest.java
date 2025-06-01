package String;

import org.junit.Test;

public class StingMethodTest {

    @Test
    public void test() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3); //abc
    }

    // String与常见其他结构的转换

    @Test
    public void test1() {
        int num = 10;

        // 基本数据类型 -->> String
        // 方式1
        String s1 = num + "";
        // 方式2
        String s2 = String.valueOf(num);

        // Sting -->> 基本数据类型
        String s3 = "123";
        int num2 = Integer.parseInt(s1);
    }

    // Sting与char[]之间的转换
    @Test
    public void test2() {
        String str = "hello";

        // String -->> char[]
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        // char[] -->> String
        String str1 = new String(charArray);
        System.out.println(str1);

    }

    // String与byte之间的转换

    @Test
    public void test3() {
        String str = new String("hello");

        // String -->> byte[]
        byte[] arr = str.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // byte[] -->> String
        String str1 = new String(arr);
        System.out.println(str1);

    }

    @Test
    public void test4() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        String s4 = "hello";
        System.out.println(s4.length());

        String s5 = "abcd";
        String s6 = "abef";
        System.out.println(s5.compareTo(s6));

        // 删除前后空格
        String s7 = "   abcd    ";
        System.out.println(s7.trim());
    }


}
