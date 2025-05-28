package Test;

public class ArrayExer04 {
    public static void main(String[] args) {
//        复制
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "\t");
        }


        array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0) {
                array2[i] = i;
            }
            System.out.println(array2[i]);
        }


    }
}
