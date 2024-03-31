public class Book  {
    private String bookName;
    private int bookPageNumber;

    public Book(String bookName, int bookPageNumber) {
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }
}
