package tasks;

import java.util.Set;

public class Task02 extends Task {

    public void updateData(Set<String> data) {
        // В методі removeIf ми проходимося циклом по всьому Set.
        // Тому за умови el.equals("kiwi") ми спочатку перевірямо
        // чи є в наявності цей елемент і якщо є видаляємо.
        data.removeIf(el -> el.equals("kiwi"));
    }
}
