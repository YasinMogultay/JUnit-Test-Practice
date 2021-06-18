import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ShoppingCartTests {

    ShoppingCart cart;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void addOneItemToCart() {
        cart.add("Apple");
        assertEquals(cart.doesContain("Apple"), true);
    }

    @Test
    public void addTwoItemsToCart() {
        cart.add("Apple");
        cart.add("Orange");
        assertThat(cart.getTotalItems(), is(2));
        assertEquals(cart.doesContain("Apple"), true);
        assertEquals(cart.doesContain("Orange"), true);
    }

    @Test
    public void addThreeItemsToCart() {
        cart.add("Apple");
        cart.add("Orange");
        cart.add("Banana");
        assertThat(cart.getTotalItems(), is(3));
        assertEquals(cart.doesContain("Apple"), true);
        assertEquals(cart.doesContain("Orange"), true);
        assertEquals(cart.doesContain("Banana"), true);
    }

    @Test
    public void checkOutOneItem() {
        cart.add("Apple");
        assertThat(cart.checkout(), is(1.5));
    }

    @Test
    public void checkOutTwoItems() {
        cart.add("Apple");
        cart.add("Orange");
        assertThat(cart.checkout(), is(3.5));
    }

    @Test
    public void checkOutThreeItems() {
        cart.add("Apple");
        cart.add("Orange");
        cart.add("Banana");
        assertThat(cart.checkout(), is(4.5));
    }

    @Test
    public void checkOutInvalidItem() {
        cart.add("Kiwi");
        assertThat(cart.checkout(), is(0.0));
    }

    @Test
    public void removeItem() {
        cart.add("Apple");
        cart.add("Orange");
        cart.remove("Apple");
        assertThat(cart.getTotalItems(), is(1));
    }

}
