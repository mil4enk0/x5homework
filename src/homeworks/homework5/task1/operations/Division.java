package homeworks.homework5.task1.operations;

public class Division extends Operation {

    public Division(double... args) {
        super(args);
    }

    @Override
    public double performOperation() {
        double result = 0;
        for (double arg : getArgs()) {
            if (arg != 0) {
                result /= arg;
            }
        }
        return result;
    }
}
