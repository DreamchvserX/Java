package Calculater.Step06.Final;

public class Multiplikation implements IRechenoperation{

    @Override
    public String getOperation() {
        return "*";
    }

    @Override
    public Integer getResult(Formel formel) {
        return formel.operand1* formel.operand2;
    }
}
