package homeworks.homework5.task1.loggers;

public class LoggersFabric {
    public static Logger getLogger(LoggerTypes loggerType) {
        switch (loggerType) {
            case CONSOLE:
                return new ConsoleLogger();
            case FILE:
                return new FileLogger();
            case DATABASE:
                return new DbLogger();
        }
        throw new RuntimeException("Передан неизвестный тип логгера!");
    }
}
