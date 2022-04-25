import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item\t\t: " + item.name());
            System.out.print(", \nPacking\t\t: " + item.packing().pack());
            System.out.println(", \nPrice\t\t: " + item.price());
        }
    }
}