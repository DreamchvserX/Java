package Calculater.Step05.Interfaces;

public class AppDemo {
    public static void main(String[] args) {
         Parsable p = new Parser();
         Parsable ibm = new IbmParser();

         Calculator c = new Calculator();
        //new Cui(ibm,c).show(); // Problem Typen unverträglich
         new Cui(ibm,c).show();

        }

}
