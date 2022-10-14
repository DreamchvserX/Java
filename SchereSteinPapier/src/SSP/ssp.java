package SSP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ssp {
    public static void main(String[] args) {

        int pcwahl;
        int spielerwahl;

        Scanner aScanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        do {
            pcwahl = (int) (Math.random() * 3 + 1);
            System.out.println("Runde starten? (y/n)");
            String str = input.next();
                if (str.equals("n")) {
                    System.out.println("Vielen Dank fuers spielen !");
                    }

                else if (str.equals("y")) {
                    System.out.println("Der PC Hat eine Wahl zwischen Schere,Stein,Papier getroffen");
                    System.out.println("Nun sind sie an der reihe, waehlen sie \n 1 = Schere \n 2 = Stein \n 3 = Papier");
                    }
                    spielerwahl = aScanner.nextInt();

                    if (spielerwahl == pcwahl) {
                        System.out.println("Sie haben " + spielerwahl + " gewaehlt, der Computer hat " + pcwahl + " gewaehlt, Unentschieden!");
                    } else if (spielerwahl == 1 & pcwahl == 2) {
                        System.out.println("Sie haben " + spielerwahl + " gewaehlt, der Computer hat " + pcwahl + " gewaehlt, Verloren!");
                    } else if (spielerwahl == 2 & pcwahl == 3) {
                        System.out.println("Sie haben " + spielerwahl + " gewaehlt, der Computer hat " + pcwahl + " gewaehlt, Verloren!");
                    } else if (spielerwahl == 3 & pcwahl == 1) {
                        System.out.println("Sie haben " + spielerwahl + " gewaehlt, der Computer hat " + pcwahl + " gewaehlt, Verloren!");
                    } else {
                        System.out.println("Sie haben " + spielerwahl + " gewaehlt, der Computer hat " + pcwahl + " gewaehlt, Gewonnen!");
                    }
            }
        while (true);
    }
}