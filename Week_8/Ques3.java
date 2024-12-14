package Week_8;

class FRUIT {
    private String color;
    private String taste;
    private double price;

    public FRUIT() {
        this("Unknown", "Unknown", 0.0);
    }
    public FRUIT(String color) {
        this(color, "Unknown", 0.0);
    }
    public FRUIT(String color, String taste) {
        this(color, taste, 0.0); 
    }
    public FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        FRUIT defaultFruit = new FRUIT();
        defaultFruit.display();

        FRUIT singleAttributeFruit = new FRUIT("Yellow");
        singleAttributeFruit.display();

        FRUIT twoAttributesFruit = new FRUIT("Green", "Sour");
        twoAttributesFruit.display();

        FRUIT fullAttributesFruit = new FRUIT("Red", "Sweet", 2.5);
        fullAttributesFruit.display();
    }
}
