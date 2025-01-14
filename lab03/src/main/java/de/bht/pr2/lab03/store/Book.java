package de.bht.pr2.lab03.store;

import java.util.Objects;

public class Book {
    // Buch:     Titel ; Typ des Buches ; Preis ; Auflage
    private String titel;

    private String genre;

    private double price;

    private int edition;


    public Book(String dataString) {
        String[] data = dataString.split(";");

            this.titel = data[0];

            genre = data[1];

            price = Double.parseDouble(data[2]);

            edition = Integer.parseInt(data[3]);

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && edition == book.edition && Objects.equals(titel, book.titel) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, genre, price, edition);
    }

    @Override
    public String toString() {
        //Buch: 7 Minuten am Tag (2016)
        return "\tBuch: " + titel + "  (" + edition + ")";
    }
}


