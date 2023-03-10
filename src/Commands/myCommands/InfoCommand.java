package Commands.myCommands;

import Classes.HumanBeingCollection;
import Commands.CommandEater;
import Commands.CommandPattern;

public class InfoCommand implements CommandPattern {
    /** Метод, выводящий информацию о коллекции */
    @Override
    public void execute() {
        if (CommandEater.getIsProgramRunning()) {
            HumanBeingCollection.getInfo();
        }
        else {
            System.out.println("Некорректная команда");
        }
    }
}
