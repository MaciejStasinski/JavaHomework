package B3;

interface WydajeDzwiek {
    public void graj();
}
interface WyswietlaObraz {
    public void wyswietl();
}

interface WyswietlaObrazIWydajeDzwiek extends WydajeDzwiek, WyswietlaObraz{

}


public class Telewizor implements WyswietlaObrazIWydajeDzwiek {
    public void graj() {
//instrukcje metody graj
    }

    public void wyswietl() {
//instrukcje metody wyswietl
    }


public class Radio implements WydajeDzwiek {
        public void graj() {
//instrukcje metody graj
        }
    }

}