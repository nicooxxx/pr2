package de.bht.pr2.lab03.store;

public class Ebook extends Book{

    private String mode = "";
    public Ebook(String dataString) {

        super(dataString);
        String[] data = dataString.split(";");

        mode = data[4];
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
