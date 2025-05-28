package Throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {

        method3();

    }

    public static void method1() throws FileNotFoundException,IOException {
        File file = new File("D:\\hello.txt");

        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
    public static void method2() throws FileNotFoundException, IOException {
        method1();
    }
    public static void method3() {
        try{
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
