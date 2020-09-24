package homeworks.homework5.task1;

import homeworks.homework5.task1.loggers.Logger;
import homeworks.homework5.task1.loggers.LoggerTypes;
import homeworks.homework5.task1.loggers.LoggersFabric;
import homeworks.homework5.task1.operations.Operation;

public class Calc {
    private Logger logger;

    public Calc(LoggerTypes type) {
        this.logger = LoggersFabric.getLogger(type);
    }

    public void doCalc(Operation operation) {
        logger.log(String.valueOf(operation.performOperation()));
    }
}

