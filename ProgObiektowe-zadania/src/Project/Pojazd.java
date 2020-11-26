package Project;

 public class Pojazd {
    int rokProdukcji;
    String rodzajSilnika;
    String kolor;
    int masa;

    public Pojazd() {
    }

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, int masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public int getMasa() {
        return masa;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void uruchomSilnik(){
        System.out.println("silnik uruchomiony");
    }
}
