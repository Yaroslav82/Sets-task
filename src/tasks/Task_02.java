package tasks;

import java.util.Set;

public class Task_02 extends Task {

    public static void main(String[] args) {
        Task task = new Task_02();
        task.start();
    }

    public void updateData(Set<String> data) {
        data.remove("kiwi");
    }
}
