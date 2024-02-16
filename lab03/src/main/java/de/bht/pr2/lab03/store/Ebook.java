package de.bht.pr2.lab03.store;

public class Ebook extends Book{

    private String version;
    public Ebook(String dataString) {

        super(dataString);

        String[] data = dataString.split(";");
        if(data.length > 4) {
            version = (data[4]);
        }
    }

    public String getMode() {
        return version;
    }

    public void setMode(String mode) {
        this.version = mode;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + getTitel() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", price=" + getPrice() +
                ", edition=" + getEdition() +
                ", mode='" + version + '\'' +
                '}';
    }
}
