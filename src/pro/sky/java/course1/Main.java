package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author mikhailSholokhov = new Author("Mikhail", "Sholokhov");
        System.out.println(leoTolstoy);
        System.out.println(mikhailSholokhov);
        System.out.println(leoTolstoy.equals(mikhailSholokhov));

        Book warAndPeace = new Book("War and Peace", 1869, leoTolstoy);
        Book quietDon = new Book("Quiet Don", 1928, mikhailSholokhov);
        warAndPeace.setPublishingYear(1868);
        System.out.println(warAndPeace);
        System.out.println(quietDon);
        System.out.println(warAndPeace.equals(quietDon));

    }
}