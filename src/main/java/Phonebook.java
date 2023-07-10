import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Map<String, Integer> book = new HashMap<>();
    public int add(String name, int number) {
        book.put(name, number);
        return book.size();
    }
    public String findByNumber(int number) {
        return null;
    }
}
