package Week_12;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    public Person(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        try {
            Person person = new Person(16);
            System.out.println("Person created successfully with age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Person person2 = new Person(25); 
            System.out.println("Person created successfully with age: " + person2.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
