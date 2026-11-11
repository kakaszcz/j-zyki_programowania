package zadanie5;

import java.util.Comparator;

public class KomparatorWieku implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o1.wiek, o2.wiek);

    }

}
