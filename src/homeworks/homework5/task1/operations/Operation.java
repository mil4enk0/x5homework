package homeworks.homework5.task1.operations;

public abstract class Operation {
    private double[] args;

    public Operation(double... args) {
        this.args = args;
    }

    public double[] getArgs() {
        return args;
    }

    public abstract double performOperation();
}
