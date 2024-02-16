package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.store.BookStore;
import de.bht.pr2.lab03.store.Ebook;

import java.util.ArrayList;
import java.util.List;

public class Tolino3BookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */
    List<Ebook> ebooks = new ArrayList<>();
    for (String datenzeile : BookStore.getSoldBooks()){

      Ebook ebook = new Ebook(datenzeile);
      if(ebook.getGenre().equals("Ebuch")){
        if (ebook.getVersion().equals("3")) {
          ebooks.add(ebook);
        }
      }
    }
    System.out.println("Anzahl Ebuecher bei Tolino 3: " + ebooks.size());
  }
}
