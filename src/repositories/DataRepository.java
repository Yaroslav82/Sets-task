package repositories;

import java.util.HashSet;
import java.util.Set;

public class DataRepository {

    public static HashSet<String> getData() {
        return new HashSet<>(Set.of("orange", "apple", "kiwi", "strawberry", "mango"));
    }
}
