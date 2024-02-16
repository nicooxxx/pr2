package de.bht.pr2.lab03.store;

public class Audiobook extends Book{
    private String mode;
    public Audiobook(String dataString) {

        super(dataString);

        String[] data = dataString.split(";");
        if(data.length > 4) {
            mode = data[4];
        }
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + getTitel() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", price=" + getPrice() +
                ", edition=" + getEdition() +
                ", mode='" + mode + '\'' +
                '}';
    }
}
