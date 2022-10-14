package Calculater.Step04.Di;

public class AppDemo {
    public static void main(String[] args) {
         Parser p = new Parser();
         IbmParser ibm = new IbmParser();

         Calculator c = new Calculator();
        //new Cui(ibm,c).show(); // Problem Typen unverträglich
         new Cui(p,c).show();

        }

}
