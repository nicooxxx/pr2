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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "\tEbuch: " + getTitel() + "  (" + getEdition() + ")";
    }
}
