package konverzijaminutaudane;

import java.util.Scanner;

public class KonverzijaMinutaUDane {

    public static void main(String[] args) {

        // Napisati program koji od korisnika zahteva da unese minute i na osnovu njih
        //računa broj dana i godina.
        System.out.println("Unesite broj minuta");
        Scanner input = new Scanner(System.in);
        int minuti = input.nextInt();
        double dani = (minuti / 24) / 60;
        double godine = (((minuti / 365) / 24) / 60);
        System.out.println("Broj dana je :" + dani + "\n" + "broj godine je:" + godine);

    }

}
