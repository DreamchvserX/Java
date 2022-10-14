package Calculater.Step02.Klassen;

import java.util.Scanner;

public class AppDemo {
    public static void main(String[] args) {

            // Eingabe
            System.out.print("Bitte Formel [a + b] eingeben :");
            String formel = new Scanner(System.in).nextLine();

            // Verarbeiter
            Parser p = new Parser();
            Formel ergebnisformel=  p.parse(formel);
            Calculator c = new Calculator();
            Integer ergebnis = c.calculate(ergebnisformel);

            //Ausgabe
            System.out.println("Die Summe ist " + ergebnis);

        }

}
