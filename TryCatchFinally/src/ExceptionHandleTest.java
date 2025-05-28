import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandleTest {

    //***********运行时异常***************
    @Test
    public void test() {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException 异常");
        }catch (NullPointerException e) {
            System.out.println("NullPointerException 异常");
        }catch (RuntimeException e) {
            System.out.println("RuntimeException 异常");
        }
        System.out.println("处理结束");
    }

    @Test
    public void test2() {
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    //***********编译时异常***************

    @Test
    public void test3() {
        try {
            File file = new File("D:\\hello.txt");

            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("读取结束");
    }
}
