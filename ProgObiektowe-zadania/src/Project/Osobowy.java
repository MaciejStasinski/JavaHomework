package Project;

public class Osobowy extends Kołowe{
    int ilośćOsób;

    public Osobowy() {
    }

    public Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.ilośćOsób = ilośćOsób;
    }

    public int getIlośćOsób() {
        return ilośćOsób;
    }

    public void setIlośćOsób(int ilośćOsób) {
        this.ilośćOsób = ilośćOsób;
    }
}
