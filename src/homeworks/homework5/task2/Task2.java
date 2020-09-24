package homeworks.homework5.task2;

import homeworks.homework5.task2.computers.Notebook;
import homeworks.homework5.task2.computers.PC;
import homeworks.homework5.task2.fabrics.NotebookFabric;
import homeworks.homework5.task2.fabrics.PCFabric;

public class Task2 {
    public static void main(String[] args) {
        NotebookFabric notebookFabric = new NotebookFabric();
        PCFabric pcFabric = new PCFabric();
        Notebook notebook = notebookFabric.getComputer();
        PC pc = pcFabric.getComputer();
        notebook.turnOn();
        pc.turnOn();
    }
}
