package zadanie8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produkt> produkty = new ArrayList<Produkt>();

        produkty.add(new Produkt("maslo", 4.99));
        produkty.add(new Produkt("pasztet", 5.49));
        produkty.add(new Produkt("kurczak", 23.55));
        produkty.add(new Produkt("mleko", 3.99));

        Collections.sort(produkty);
        System.out.println(produkty);
    }


}
