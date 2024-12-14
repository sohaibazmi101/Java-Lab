package Week_10;

import Week_10.Edible.Fruit;
import Week_10.Edible.Vegetable;

class Edible{
    static class Fruit{
        public static void fruitDetails(){
            System.out.println("Fruit Details : Fresh and Juicy Fruit Available");
        }
        public void fruitPackaging(){
            System.out.println("Fruit Packaging: Fruits are packed in eco-friendly containers.");
        }
    }
    static class Vegetable{
        public static void vegetableDetails() {
            System.out.println("Vegetable Details: Fresh and organic vegetables available.");
        }

        public void vegetablePackaging() {
            System.out.println("Vegetable Packaging: Vegetables are packed in biodegradable bags.");
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Fruit.fruitDetails();
        Vegetable.vegetableDetails();

        Fruit fruit = new Fruit();
        fruit.fruitPackaging();

        Vegetable vegetable = new Vegetable();
        vegetable.vegetablePackaging();
    }
}
