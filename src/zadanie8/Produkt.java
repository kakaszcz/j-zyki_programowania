package zadanie8;

public class Produkt implements Comparable<Produkt> { //<Produkt> bo okreslamy typ obiektow z ktorym bedziemy porownywac
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int compareTo(Produkt innyProdukt) {
        return Double.compare(this.cena, innyProdukt.cena); //- wtedy this powinien byc pierwszy, +inny powinien byc pierwszy
    }
    public String toString() {
        return nazwa + " - " + cena + "zl";
    }
}
