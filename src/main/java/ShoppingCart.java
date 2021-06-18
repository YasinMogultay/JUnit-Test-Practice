
import java.util.ArrayList;

public class ShoppingCart {

    // ArrayList called items to store items for the shopping cart
    ArrayList<String> items;

    // Constructor where items are equal to new arraylist<string>();
    public ShoppingCart() {
        this.items = new ArrayList<String>();
    }

    // add new items to array list
    public void add(String item) {
        items.add(item);
    }

    // remove items from an array list
    public void remove(String item) {
        items.remove(item);
    }

    // getting totals items from an array list
    public int getTotalItems() {
        return items.size();
    }

    // check if an array has an item
    public Boolean doesContain(String itemName) {
        return items.contains(itemName);
    }

    // checkout and return total cost for shopping cart
    public Double checkout() {
        double total = 0;
        for (String item : items) {
            if (item.equals("Apple")) {
                total += 1.5;
            } else if (item.equals("Orange")) {
                total += 2.0;
            } else if (item.equals("Banana")) {
                total += 1.0;
            }
        }
        return total;
    }

}
