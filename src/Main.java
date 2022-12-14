public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1869, new Author("Leo", "Tolstoy"));
        System.out.println("warAndPeace.bookName = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.publishingYear = " + warAndPeace.getPublishingYear());
        System.out.println("warAndPeace.getBookAuthor() = " + warAndPeace.getBookAuthor().getAuthorName() + " " + warAndPeace.getBookAuthor().getAuthorSurname());
        warAndPeace.setPublishingYear(1868);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());


        Book quietDon = new Book("Quiet Don", 1928, new Author("Mikhail", "Sholokhov"));
        System.out.println("quietDon.getBookName() = " + quietDon.getBookName());
        System.out.println("quietDon.getPublishingYear() = " + quietDon.getPublishingYear());
        System.out.println("quietDon.getBookAuthor() = " + quietDon.getBookAuthor().getAuthorName() + " " + quietDon.getBookAuthor().getAuthorSurname());

        Author leoTolstoy = new Author("Leo", "Tolstoy");
        System.out.println("leoTolstoy.getAuthorName() = " + leoTolstoy.getAuthorName());
        System.out.println("leoTolstoy.getAuthorSurname() = " + leoTolstoy.getAuthorSurname());

        Author mikhailSholokhov = new Author("Mikhail", "Sholokhov");
        System.out.println("mikhailSholokhov.getAuthorName() = " + mikhailSholokhov.getAuthorName());
        System.out.println("mikhailSholokhov.getAuthorSurname() = " + mikhailSholokhov.getAuthorSurname());

    }
}