package homeworks.homework5.task1;

import homeworks.homework5.task1.operations.*;

public class OperationsFabric {
    public static Operation getOperation(OperationTypes type, double... args) {
        switch (type) {
            case ADDITION:
                return new Addition(args);
            case DIVISION:
                return new Division(args);
            case SUBTRACTION:
                return new Subtraction(args);
            case MULTIPLICATION:
                return new Multiplication(args);
        }
        throw new RuntimeException("Передан неизвестный тип операции!");
    }
}
