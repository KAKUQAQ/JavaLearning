package exer02;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setBookName("哈哈哈");
        b1.setAuthor("海绵宝宝");
        b1.setPrice(180.0);
        System.out.println(b1.info());
    }
}
