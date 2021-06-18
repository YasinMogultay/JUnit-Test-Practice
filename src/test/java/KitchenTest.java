import org.junit.*;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp() {
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyKitchen.isEmpty());
        assertTrue(kitchenWithOne.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testAdd() {
        emptyKitchen.add("Any tortilla");

        // Making sure the emptyKitchen returns false once we add an element to it
        assertFalse(emptyKitchen.isEmpty());

        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testRemove() {
        emptyKitchen.pop();
        assertEquals(0, emptyKitchen.size());

        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(3,kitchenWithMany.size());
    }

    @Test
    public void testContains() {
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("white corn"));
    }

}
