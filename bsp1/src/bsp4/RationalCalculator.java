package bsp4;

public class RationalCalculator extends AbstractCalculator{


    public RationalCalculator(){
        super(
                (x,y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x,y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x,y) -> new Number(x.getA() * y.getA(), x.getB() * y.getB()),
                (x,y) -> new Number(x.getA() / y.getA(), x.getB() / y.getB())
        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide(a,b);
    }

}
