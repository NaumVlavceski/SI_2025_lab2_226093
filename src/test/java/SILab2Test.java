import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<Item> createList(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void everyStatementTest() {
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "1234567890123456"));
        assertEquals("allItems list can't be null!", ex1.getMessage());

        List<Item> itemsWithNullName = createList(new Item(null, 1, 100, 0));
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemsWithNullName, "1234567890123456"));
        assertEquals("Invalid item!", ex2.getMessage());

        List<Item> valid = createList(
                new Item("name2",30,5,5),
                new Item("name",300,0,5));
        RuntimeException ex3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(valid,null));
        assertEquals("Invalid card number!",ex3.getMessage());

        RuntimeException ex4 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(valid,"123456789112345A"));
        assertEquals("Invalid character in card number!",ex4.getMessage());

//        RuntimeException ex5 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(valid,"1234567891123456"));
        double result = SILab2.checkCart(valid,"1234567891123456");
        assertEquals(-660.0,result);

    }
}
