public class Item {
    private Food food;
    private int count;
    private String description;

    public Item(Food f, int i, String s) {
        this.food = f;
        this.count = i;
        this.description = s;
    }

    public Item(Food f, int i) {
        this.food = f;
        this.count = i;
    }

    public Food getFood() {
        return food;
    }

    public int getCount() {
        return count;
    }

    public String getDescription() {
        if (description.isEmpty()) {
            return null;
        } else {
            return description;
        }
    }
}
