package String;

import org.junit.Test;

public class StringDemo {

    public void test1(){
        String s1 = "hello"; // 字面量的定义方式
        String s2 = "world";
        System.out.println(s1.equals(s2));
    }

    // 不可变性
    // 对字符串变量重新赋值时，需要重新制定一个字符串常量进行赋值
    // 当对现有的字符串进行拼接操作时，需要新建字符串
    // replace() 替换字符仍然需要重新开辟空间
    public void test2(){
        String s1 = "hello";
        String s2 = "hello";

        s2 = "hi";
        System.out.println(s1);
    }

    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace("l", "w");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void test4(){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";

        p1.name = "Jerry";
        System.out.println(p2.name);
    }

    // String连接符
    @Test
    public void test5(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;
        String s8 = s1.concat(s2);
        String s10 = "hello".concat("world");
        String s11 = s1.concat("world");

        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        System.out.println(s5 == s6); //false
        System.out.println(s5 == s7); //false

        String s9 = s5.intern();// intern()返回字符串中常量的值
        System.out.println(s3 == s9);//true

        System.out.println(s8 == s10); //false
        System.out.println(s8 == s11); //false
        System.out.println(s10 == s11); //false

    }

}

class Person{
    public String name;

}
