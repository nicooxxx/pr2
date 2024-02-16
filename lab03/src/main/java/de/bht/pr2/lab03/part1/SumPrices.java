package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.store.*;

import java.util.ArrayList;
import java.util.List;

public class SumPrices {

    public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */

        // Gesamt Preise pro Genre
        double sumBooks = 0;
        double sumEbooks = 0;
        double sumAudiobooks= 0;

        for (String datenzeile : BookStore.getSoldBooks()) {
            List<Book> books = new ArrayList<>();
            List<Ebook> ebooks = new ArrayList<>();
            List<Audiobook> audiobooks = new ArrayList<>();

            Book book = new Book(datenzeile);
            Ebook ebook = new Ebook(datenzeile);
            Audiobook audiobook = new Audiobook(datenzeile);

            if (book.getGenre().equals("Buch")) {
                sumBooks += book.getPrice();
            } else if (ebook.getGenre().equals("Ebuch")) {
                sumEbooks += ebook.getPrice();
            } else if (audiobook.getGenre().equals("Hoerbuch")) {
                sumAudiobooks += audiobook.getPrice();
            }
        }

        System.out.printf("Summe Buch:      € %.2f%n", sumBooks);
        System.out.printf("Summe Ebuch:     € %.2f%n", sumEbooks);
        System.out.printf("Summe Hoerbuch:  € %.2f%n", sumAudiobooks);
        System.out.printf("Summe Alle:      € %.2f%n", sumBooks + sumEbooks + sumAudiobooks);
        // Print all students which could be parsed

        /*System.out.println("List of Book objects:");
        for (Ebook book : ebooks) {
            System.out.println(book);
        }*/
    }
}
