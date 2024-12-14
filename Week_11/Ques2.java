package Week_11;

interface Bike {
    void offer();
    default void details() {
        System.out.println("Bike: A two-wheeled vehicle for fast travel.");
    }
}

interface Scooty {
    void offer();
    default void details() {
        System.out.println("Scooty: A small, light two-wheeled vehicle for daily commuting.");
    }
}

class BuySomething implements Bike, Scooty {

    @Override
    public void offer() {
        System.out.println("Special offer: Buy a vehicle now!");
    }
    @Override
    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}

public class Ques2 {
    public static void main(String[] args) {
        BuySomething buySomething = new BuySomething();
        buySomething.offer();
        buySomething.details();
    }
}
