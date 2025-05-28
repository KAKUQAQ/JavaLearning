package exer02;

public class Book {

    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

//   图书信息
    public String info(){
        return "Book Name: " + bookName + ", Author: " + author + ", Price: " + price;
    }
}
