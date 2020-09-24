package homeworks.homework5.task1.operations;

public class Multiplication extends Operation{

    public Multiplication(double... args) {
        super(args);
    }

    @Override
    public double performOperation() {
        double result = 0;
        for (double arg : getArgs()) {
            result *= arg;
        }
        return result;
    }
}
