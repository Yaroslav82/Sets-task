package tasks;

import repositories.DataRepository;
import utils.Printer;

import java.util.Set;

public abstract class Task implements DataUpdater {

    public void start() {
        Set<String> data = DataRepository.getData();
        Printer<String> printer = new Printer<>();
        printer.print("Initial data", data);
        updateData(data);
        printer.print("Updated data", data);
    }
}
