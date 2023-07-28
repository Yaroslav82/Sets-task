package tasks;

import java.util.Set;

public class Task_01 extends Task {

    public static void main(String[] args) {
        Task task = new Task_01();
        task.start();
    }

    public void updateData(Set<String> data) {
        data.add("grape");
    }
}
