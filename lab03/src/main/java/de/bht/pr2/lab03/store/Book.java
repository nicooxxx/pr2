package de.bht.pr2.lab03.store;

public class Book {
    // Buch:     Titel ; Typ des Buches ; Preis ; Auflage
    private String titel = "";

    private String genre = "";

    private double price = -1;

    private int edition = 0;


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
    public String toString() {
        return "Book{" +
                "Titel='" + titel + '\'' +
                ", Genre='" + genre + '\'' +
                ", Price=" + price +
                ", Edition=" + edition +
                '}';
    }
}


