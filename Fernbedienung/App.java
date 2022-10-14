package iad.oop.app;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Momentane Senderliste besteht aus : " + liste);
            System.out.println("Sender hinzufuegen? (y/n)");
            if (input.next().startsWith("y")) {
                System.out.println("Sendername : ");
                liste.add(input.next());
            } else {

                System.out.println("Druecken Sie 'n' fuer naechsten Sender )");
                if (input.next().startsWith("n")) {
                    for (int i = 0; i < liste.size(); i++)
                        System.out.println(i +" "+ liste.get(i));

                } else {
                    break;
                }
            }

        } while (true);
        input.close();
        System.out.println("Momentane Senderliste besteht aus : " + liste);


    }
}