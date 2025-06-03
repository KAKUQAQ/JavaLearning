package StringBuffer;

import org.junit.Test;

public class StringBufferBuildTest {

    @Test
    public void test() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Hello").append("World");
        System.out.println(sbuilder);

        sbuilder.delete(1, 3);
        System.out.println(sbuilder);

        sbuilder.replace(1,3, "www");
        System.out.println(sbuilder);

        sbuilder.insert(2,"x");

        System.out.println(sbuilder);

        System.out.println(sbuilder.length());
    }
}
