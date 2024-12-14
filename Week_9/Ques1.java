package Week_9;

class Vehicle{
    public void cost(double cost){
        System.out.println("Cost of Vehicle : "+cost);
    }
}

class Bus extends Vehicle{
    public void display(){
        System.out.println("Total Seat : 120");
        System.out.println("Time : 1hr");
    }
}

class Train extends Vehicle{
    public void display(){
        System.out.println("Train number : 12225");
        System.out.println("Train Name : Kaifiyat Express");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();
        bus.cost(120.00);
        bus.display();
        train.cost(340.00);
        train.display();
    }
}
