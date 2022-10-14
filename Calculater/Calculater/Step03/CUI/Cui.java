package Calculater.Step03.CUI;

import java.util.Scanner;

public class Cui {

    public void show(){
        System.out.print("Bitte Formel [a + b] eingeben :");
        String formel = new Scanner(System.in).nextLine();

        Parser p = new Parser();
        Formel ergebnisformel=  p.parse(formel);
        Calculator c = new Calculator();
        Integer ergebnis = c.calculate(ergebnisformel);

        //Ausgabe
        System.out.println("Die Summe ist " + ergebnis);
    }
}
