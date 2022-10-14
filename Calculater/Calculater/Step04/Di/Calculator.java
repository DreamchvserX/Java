package Calculater.Step04.Di;

import java.security.InvalidParameterException;

public class Calculator {

    public Integer calculate(Formel formel){
        if(formel.operator.equals("\\+")){
            return formel.operand1 + formel.operand2;
        }else if(formel.operator.equals("-")){
            return formel.operand1 - formel.operand2;
        }
        throw new InvalidParameterException("unbekannte Operation");

    }
}
