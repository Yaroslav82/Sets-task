package tasks;

import java.util.HashSet;
import java.util.Set;

public class Task_02 {

    private static void updateData(Set<String> data) {
        data.remove("kiwi");
    }

    private static HashSet<String> getData() {
        return new HashSet<>(Set.of("orange", "apple", "kiwi", "strawberry", "mango"));
    }
}
