package tasks;

import service.DataService;
import utils.Printer;

import java.util.Set;

public class Task_02 {

    public static void main(String[] args) {
        Set<String> data = DataService.getData();
        Printer<String> printer = new Printer<>();
        printer.print("Initial data", data);
        updateData(data);
        printer.print("Updated data", data);
    }

    private static void updateData(Set<String> data) {
        data.remove("kiwi");
    }
}
