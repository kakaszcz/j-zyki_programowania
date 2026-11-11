package zadanie5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dane ilu osob chcesz wprowadzic?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj imie osoby nr" + (i+1));
            String imie = scanner.nextLine();

            System.out.println("Podaj wiek osoby:" + imie);
            int wiek = scanner.nextInt();
            scanner.nextLine();

            osoby.add(new Osoba(wiek, imie));
        }
        osoby.sort(new KomparatorWieku());
        System.out.println(osoby);
    }
}
