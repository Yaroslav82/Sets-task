package service;

import java.util.HashSet;
import java.util.Set;

public class DataService {

    public static HashSet<String> getData() {
        return new HashSet<>(Set.of("orange", "apple", "kiwi", "strawberry", "mango"));
    }
}
