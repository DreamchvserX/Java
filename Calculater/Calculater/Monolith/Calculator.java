package Calculater.Monolith;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Eingabe
        System.out.print("Bitte Formel [a + b] eingeben :");
        String formel = new Scanner(System.in).nextLine();

        // Verarbeiter
        String operatoren[] = formel.split("\\+");
        Integer summe = Integer.parseInt(operatoren[0]) + Integer.parseInt(operatoren[1]);

        //Ausgabe
        System.out.println("Die Summe ist " + summe);

    }
}
