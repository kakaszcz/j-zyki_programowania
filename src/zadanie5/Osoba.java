package zadanie5;

public class Osoba {
    int wiek;
    String imie;

    public Osoba(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }
    public String toString() {
        return imie + " - " + wiek + "lat";
    }
}
