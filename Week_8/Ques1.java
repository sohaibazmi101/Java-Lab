package Week_8;

class Fruit{
    private String color;
    private String taste;
    private double price;

    public Fruit(String color, String taste, double price){
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    public void display(){
        System.out.println("Color : "+color);
        System.out.println("Taste : "+taste);
        System.out.println("Price : "+price);
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Red", "Sweet", 120.00);
        Fruit fruit2 = new Fruit("Yellow", "Sweet", 60.00);
        Fruit fruit3 = new Fruit("Orange", "Sour", 90.00);

        fruit1.display();
        fruit2.display();
        fruit3.display();
    }
}
