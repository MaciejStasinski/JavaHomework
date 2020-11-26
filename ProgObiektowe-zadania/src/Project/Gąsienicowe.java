package Project;

public class Gąsienicowe extends Pojazd{
    int moc;

    public Gąsienicowe() {
    }

    public Gąsienicowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void  uruchomSilnik(){
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }
}
