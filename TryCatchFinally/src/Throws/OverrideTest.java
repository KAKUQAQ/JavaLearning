package Throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try {
            f.method1();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class Father{
    public void method1() throws IOException {

    }

    public void method2(){

    }
}

class Son extends Father {
    public void method1() throws FileNotFoundException {

    }

    public void method2(){

    }
}
