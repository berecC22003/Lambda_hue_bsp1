package bsp4;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation mulitply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract,
                              CalculationOperation multiply, CalculationOperation divide){
        //Todo
    }

    public abstract  Number add(Number a, Number b);
    public abstract  Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public  abstract Number divide(Number a, Number b);
}
