package Project;

public class Ciężarówka extends Kołowe{
    int udźwig;

    public Ciężarówka() {
    }

    public Ciężarówka(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int udźwig) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udźwig = udźwig;
    }

    public int getUdźwig() {
        return udźwig;
    }

    public void setUdźwig(int udźwig) {
        this.udźwig = udźwig;
    }

    public void podnieśSkrzynie(){

    }
}
