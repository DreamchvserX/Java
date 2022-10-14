package Calculater.Step05.Interfaces;

public class IbmParser implements Parsable {


    @Override
    public Formel parse(String formel) {
        Formel ergebnisformel= new Formel();
        if(formel.contains("+")){
            ergebnisformel.operator="\\+";
        }else if (formel.contains("-")){
            ergebnisformel.operator="-";
        }

        String operatoren[] = formel.split(ergebnisformel.operator);
        ergebnisformel.operand1= Integer.parseInt(operatoren[0].trim()) ;
        ergebnisformel.operand2= Integer.parseInt(operatoren[1].trim());
        return ergebnisformel;
    }
}
