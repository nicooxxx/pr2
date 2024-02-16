package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.store.Audiobook;
import de.bht.pr2.lab03.store.Book;
import de.bht.pr2.lab03.store.BookStore;
import de.bht.pr2.lab03.store.Ebook;

import java.util.*;

public class GroupByBookType {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

Buecher Anzahl: 6
	Buch: 7 Minuten am Tag (2016)
	Buch: Der Heimweg (2016)
	Buch: Ohne Schuld (2020)
	Buch: Escape Room (2020)
	Buch: Der Heimweg (2020)
	Buch: Ohne Schuld (2016)
Ebuecher Anzahl: 4
	Ebuch: Ohne Schuld (2020)
	Ebuch: Der Heimweg (2020)
	Ebuch: Zwei Handvoll Leben (2020)
	Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
Hoerbuecher Anzahl: 5
	Hoerbuch: QualityLand 2.0 (2019)
	Hoerbuch: Funken Mord (2018)
	Hoerbuch: QualityLand 2.0 (2018)
	Hoerbuch: Funken Mord (2019)
	Hoerbuch: Harry Potter - alle 7 Baende (2018)

     */
    Set<Book> books = new HashSet<>();
    Set<Ebook> ebooks = new HashSet<>();
    Set<Audiobook> audiobooks = new HashSet<>();

    for (String data : BookStore.getSoldBooks()){
      Book book = new Book(data);
      Ebook ebook = new Ebook(data);
      Audiobook audiobook = new Audiobook(data);

      if(book.getGenre().equals("Buch")){
        books.add(book);
      }else if(ebook.getGenre().equals("Ebuch")){
        ebooks.add(ebook);
      }else if(audiobook.getGenre().equals("Hoerbuch")){
        audiobooks.add(audiobook);
      }
    }

    System.out.println("Becher Anzahl: " + books.size());
    for (Book s : books){
      if(s.getGenre().equals("Buch")) {
        System.out.println(s);
      }
    }

    System.out.println("Ebuecher Anzahl: " + ebooks.size());
    for (Ebook s : ebooks){
      if(s.getGenre().equals("Ebuch")) {
        System.out.println(s);
      }
    }

    System.out.println("Hoerbuecher Anzahl: " + audiobooks.size());
    for (Audiobook s : audiobooks){
      if(s.getGenre().equals("Hoerbuch")) {
        System.out.println(s);
      }
    }
  }
}
