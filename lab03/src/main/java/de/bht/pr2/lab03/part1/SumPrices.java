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

        List<Book> books = new ArrayList<>();

        for (String datenzeile : BookStore.getSoldBooks()) {
            Book book = new Book(datenzeile);
            if(book.getPrice()>0){
                books.add(book);
            }

        }

        // Print all students which could be parsed
        System.out.println("List of Book objects:");
        for (Book book : books) {
            System.out.println(book);
        }

        double sumBooks = 0;

        for (Book book : books){
            sumBooks += book.getPrice();
        }
        System.out.println("Summe Buch: \t€ " + String.format("%.2f",sumBooks));
    }
}
