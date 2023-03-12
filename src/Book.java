import java.time.Year;

public class Book {
   private String bookName;
   private int publishingYear;

    public Book (String Bookname, int publishingYear){
        this.bookName=Bookname;
        this.publishingYear=publishingYear;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
}


