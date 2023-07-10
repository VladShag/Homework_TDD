import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Phonebook {
    Map<String, Integer> book = new TreeMap<>();
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
        return book.getOrDefault(name, 0);
    }
    public void printAllNames() {
        book.keySet().forEach(System.out::println);
    }
}
