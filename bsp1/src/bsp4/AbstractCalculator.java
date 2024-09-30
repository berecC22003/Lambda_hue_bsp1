package bsp4;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation mulitply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract,
                              CalculationOperation mulitply, CalculationOperation divide){

    }

    public abstract  Number add(Number a, Number b);
    public abstract  Number subtract(Number a, Number b);
    public abstract Number mulitply(Number a, Number b);
    public  abstract Number divide(Number a, Number b);
}
