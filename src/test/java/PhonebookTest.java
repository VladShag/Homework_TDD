import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.hamcrest.core.StringContains;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhonebookTest {
    private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void addOneTest() {
        Phonebook phonebookTest = new Phonebook();
        Assertions.assertEquals(1, phonebookTest.add("Ivan", 899999212));
    }
    @Test
    public void addTwoTest() {
        Phonebook phonebookTest = new Phonebook();
        int result = 0;
        result = phonebookTest.add("Ivan", 15);
        result = phonebookTest.add("Sergey", 10);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void findByNumberTest() {
        Phonebook phonebookTest = new Phonebook();
        phonebookTest.add("Ivan", 15);
        Assertions.assertEquals("Ivan", phonebookTest.findByNumber(15));
    }
    @Test
    public void findNumberThatNotAddedTest() {
        Phonebook phonebookTest = new Phonebook();
        Assertions.assertNull(phonebookTest.findByNumber(15));
    }
    @Test
    public void findByNameTest() {
        Phonebook phonebookTest = new Phonebook();
        phonebookTest.add("Ivan", 15);
        Assertions.assertEquals(15, phonebookTest.findByName("Ivan"));
    }
    @Test
    public void findByNameThatNotAddedTest() {
        Phonebook phonebookTest = new Phonebook();
        phonebookTest.add("Ivan", 15);
        Assertions.assertEquals(0, phonebookTest.findByName("Sergey"));
    }
    @Test
    public void printAllNamesTest() {
        Phonebook phonebookTest = new Phonebook();
        phonebookTest.add("Ivan", 15);
        phonebookTest.printAllNames();
        Assertions.assertEquals(outContent.toString(), "Ivan\n");
    }
    @AfterAll
    public static void restoreStreams() {
        System.setOut(null);
    }

}
