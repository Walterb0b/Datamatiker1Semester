package Lesson06.Book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    public Book(){
        this("Unknown", "Unknown", 0, 0.0, false);
    }

    public Book(String title, String author){
        this(title, author, 0, 0.0, false);
    }

    public Book(String title, String author, int pages, double price, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public int getPages(){return pages;}
    public double getPrice(){return price;}
    public boolean getIsAvailable(){return isAvailable;}

    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setPages(int pages){this.pages = pages;}
    public void setPrice(double price){this.price = price;}
    public void setAvailable(boolean isAvailable){this.isAvailable = isAvailable;}

    @Override
    public String toString(){
        return "Book{" + "Book title = " + title + "\'" +
                " Author name = " + author + "\'" +
                " Number of pages = " + pages + "\'" +
                " Price = " + price + "\'" +
                " Is Available = " + isAvailable + "}";
    }
}
