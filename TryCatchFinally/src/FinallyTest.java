import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    @Test
    public void test1() {
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(10 / 0);//在catch中存在异常
        }finally {
            System.out.println("finally");// 一定要执行的代码放在Finally中
        }
    }

    // 实际开发中Finally 的使用
    @Test
    public void test3() {

        FileInputStream fis = null;
        try {
            File file = new File("D:\\hello.txt");

            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            // 将流资源的关闭操作放在Finally中
            try {
                if (fis != null)
                    fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
