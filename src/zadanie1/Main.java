package zadanie1;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZbioryLiczb zbiory = new ZbioryLiczb();

        System.out.println("Ile liczb chcesz podac?");
        int n = scanner.nextInt();

        for(int i = 0; i <n; i++) {
            System.out.println("Podaj liczbe nr" + (i+1));
            zbiory.dodaj(scanner.nextInt());
        }
        zbiory.wyswietl();

    }
}
