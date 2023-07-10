import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class PhonebookTest {

    @Test
    public void addOneTest() {
        Phonebook phonebookTest = new Phonebook();
        Assertions.assertEquals(phonebookTest.add("Ivan", 899999212), 1);
    }
    @Test
    public void addTwoTest() {
        Phonebook phonebookTest = new Phonebook();
        int result = 0;
        result = phonebookTest.add("Ivan", 15);
        result = phonebookTest.add("Sergey", 10);
        Assertions.assertEquals(result, 2);
    }

}
