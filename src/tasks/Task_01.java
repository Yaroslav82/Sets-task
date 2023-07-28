package tasks;

import utils.Printer;

import java.util.HashSet;
import java.util.Set;

public class Task_01 {

    public static void main(String[] args) {
        Set<String> data = getData();
        Printer<String> printer = new Printer<>();
        printer.print("Initial data", data);
        updateData(data);
        printer.print("Updated data", data);
    }

    private static void updateData(Set<String> data) {
        data.add("grape");
    }

    private static HashSet<String> getData() {
        return new HashSet<>(Set.of("orange", "apple", "kiwi", "strawberry", "mango"));
    }
}
