import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Phonebook {
    Map<String, Integer> book = new HashMap<>();
    public int add(String name, int number) {
        book.put(name, number);
        return book.size();
    }
    public String findByNumber(int number) {
        if(book.containsValue(number)) {
            for (Map.Entry<String, Integer> entry : book.entrySet()) {
                if(Objects.equals(number, entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }
    public int findByName(String name) {
        return 0;
    }
}
