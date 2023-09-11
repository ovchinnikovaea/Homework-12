package Homework12;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println(levTolstoy);

        Author mikhailSholokhov = new Author("Михаил", "Шолохов");
        System.out.println(mikhailSholokhov);

        System.out.println(levTolstoy.equals(mikhailSholokhov));
        System.out.println(levTolstoy.hashCode());
        System.out.println(mikhailSholokhov.hashCode());

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1869);
        System.out.println(warAndPeace);

        warAndPeace.setPublicationYear(1870);
        System.out.println(warAndPeace.getPublicationYear());

        Book quietDon = new Book("Тихий Дон", mikhailSholokhov, 1928);
        System.out.println(quietDon);

        System.out.println(warAndPeace.equals(quietDon));
        System.out.println(warAndPeace.hashCode());
        System.out.println(quietDon.hashCode());

    }
}