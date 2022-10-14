package Calculater.Step06.Final;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Parser implements Parsable {

    private ArrayList<IRechenoperation> rechoperationen;
    public Parser(ArrayList<IRechenoperation> rechoperationen) {
        this.rechoperationen= rechoperationen;
    }

    public Formel parse(String formel) {
        Formel ergebnisformel = new Formel();

        for (var ro : rechoperationen) {
            if (formel.contains(ro.getOperation())) {
                ergebnisformel.operator = ro.getOperation();

                String operatoren[] = formel.split(new String("\\"+ ergebnisformel.operator));
                ergebnisformel.operand1 = Integer.parseInt(operatoren[0].trim());
                ergebnisformel.operand2 = Integer.parseInt(operatoren[1].trim());
                return ergebnisformel;
            }

        }
        throw new InvalidParameterException("Noch nicht vorhanden");
    }

}
