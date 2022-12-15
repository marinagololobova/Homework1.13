public class Book {
    private String bookName;

    private int publishingYear;
    private Author bookAuthor;

    public Book(String bookName, int publishingYear, Author bookAuthor) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

