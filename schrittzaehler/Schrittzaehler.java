package iad.oop.schrittzaehler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Schrittzaehler {
    public static void main(String[] args) {

        int schritte = 0;
        String date = String.valueOf(LocalDateTime.now());

        for (int i = 0; i < 999; i++) {
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            System.out.println("Aktuelles Datum und Uhrzeit : "+dtf2.format(LocalDateTime.now())+" Aktuelle Schritte : "+ i);
        }

    }
}
