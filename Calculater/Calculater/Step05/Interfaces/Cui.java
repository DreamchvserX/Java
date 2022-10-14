package Calculater.Step05.Interfaces;

import java.util.Scanner;

public class Cui {

    private Parsable p;
    private Calculator c;
    public Cui(Parsable p , Calculator c){
        this.c=c ;
        this.p= p;
    }
    public void show(){
        System.out.print("Bitte Formel [a + b] eingeben :");
        String formel = new Scanner(System.in).nextLine();

        Formel ergebnisformel=  p.parse(formel);
        Integer ergebnis = c.calculate(ergebnisformel);
        //Ausgabe
        System.out.println("Die Summe ist " + ergebnis);
    }
}
