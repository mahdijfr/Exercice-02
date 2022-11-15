import java.util.*;

public class Food {
    static ArrayList<Food> MENU = new ArrayList<>();
    private String name;
    private int price;

    public Food(String a, int b) {
        this.name = a;
        this.price = b;
        MENU.add(this);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public static void displayMenu() {
        System.out.println("-------------------------");
        System.out.println("Menu: ");
        for (int i = 0; i < Food.MENU.size(); i++) {
            System.out.println("Food " + (i + 1) + ": " + Food.MENU.get(i).getName() + "     Price: " + Food.MENU.get(i).getPrice());
        }
        System.out.println("-------------------------");
    }
}


