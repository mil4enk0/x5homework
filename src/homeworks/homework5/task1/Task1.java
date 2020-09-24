package homeworks.homework5.task1;

import homeworks.homework5.task1.loggers.LoggerTypes;
import homeworks.homework5.task1.operations.OperationTypes;

public class Task1 {
    public static void main(String[] args) {
        Calc calc = new Calc(LoggerTypes.CONSOLE);
        calc.doCalc(OperationsFabric.getOperation(OperationTypes.ADDITION, 4, 5.5, 7, -5, 0));
    }
}
