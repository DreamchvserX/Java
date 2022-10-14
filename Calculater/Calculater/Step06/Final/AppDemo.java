package Calculater.Step06.Final;

import java.util.ArrayList;

public class AppDemo {
    public static void main(String[] args) {

        // Liste von Rechenoperationen

        ArrayList<IRechenoperation> rechoperationen = new ArrayList<>();
        rechoperationen.add(new Addition());
        rechoperationen.add(new Subtraktion());
        rechoperationen.add(new Multiplikation());
         Parsable p = new Parser(rechoperationen);
         Parsable ibm = new IbmParser(rechoperationen);

         Calculator c = new Calculator(rechoperationen);
        //new Cui(ibm,c).show(); // Problem Typen unverträglich
         new Cui(p,c).show();

        }

}
