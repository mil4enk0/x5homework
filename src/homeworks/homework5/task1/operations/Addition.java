package homeworks.homework5.task1.operations;

public class Addition extends Operation {

    public Addition(double... args) {
        super(args);
    }
    @Override
    public double performOperation() {
        double sum = 0;
        for (double arg : getArgs()) {
            sum += arg;
        }
        return sum;
    }
}
