package Calculater.Step06.Final;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Calculator implements ICalculator{

    private ArrayList<IRechenoperation> rechoperationen;
    public Calculator(ArrayList<IRechenoperation> rechoperationen) {
        this.rechoperationen = rechoperationen;
    }

    public Integer calculate(Formel formel){
        for (var op : rechoperationen ) {
            if(formel.operator.equals(op.getOperation())){
                return op.getResult(formel);

            }

        }
        throw new InvalidParameterException("unbekannte Operation");

    }
}
