package zadanie1;

import java.util.HashSet;
import java.util.TreeSet;

public class ZbioryLiczb {
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public void dodaj(int liczba) {
        hashSet.add(liczba);
        treeSet.add(liczba);
    }

    public void wyswietl() {
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
