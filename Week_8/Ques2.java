package Week_8;

class Fruit1{
    private String color;
    private String taste;
    private double price;
    public void setDetails(String color, String taste, double price){
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

public class Ques2 {
    public static void main(String[] args) {
        Fruit1 fruit1 = new Fruit1();
        Fruit1 fruit2 = new Fruit1();
        Fruit1 fruit3 = new Fruit1();

        fruit1.setDetails("Red", "Sweet", 120.00);
        fruit2.setDetails("Yellow", "Sweet", 60.00);
        fruit3.setDetails("Orange", "Sour", 90.00);

        fruit1.display();
        fruit2.display();
        fruit3.display();
    }
}
