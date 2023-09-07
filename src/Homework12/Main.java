package Homework12;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println(levTolstoy.getName());
        System.out.println(levTolstoy.getLastName());

        Author mikhailSholokhov = new Author("Михаил", "Шолохов");
        System.out.println(mikhailSholokhov.getName());
        System.out.println(mikhailSholokhov.getLastName());

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1869);
        System.out.println(warAndPeace.getBookTitle());
        System.out.println(warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getLastName());
        System.out.println(warAndPeace.getPublicationYear());

        warAndPeace.setPublicationYear(1870);
        System.out.println(warAndPeace.getPublicationYear());

        Book quietDon = new Book("Тихий Дон", mikhailSholokhov, 1928);
        System.out.println(quietDon.getBookTitle());
        System.out.println(quietDon.getAuthor().getName() + " " + quietDon.getAuthor().getLastName());
        System.out.println(quietDon.getPublicationYear());

    }
}
