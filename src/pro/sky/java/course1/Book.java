package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private String bookName;
    private int publishingYear;
    private final Author bookAuthor;

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

    @Override
    public String toString() {
        return "Название книги " + this.bookName + ", год публикации " + this.publishingYear + ", автор " + this.bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, bookAuthor);
    }
}

