package Project;

public class Kołowe extends Pojazd{
    String rozmiarOpony;

    public Kołowe() {
    }

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }
}
