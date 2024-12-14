package Week_10;

import Week_10.Person.Address;
import Week_10.Person.DateOfBirth;

class Person{
    private String name;
    private String phone;
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    class Address{
        private String houseNo;
        private String street;
        private String city;
        private String state;
        public Address(String houseNo, String street, String city, String state){
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }
        public void displayAddr(){
            System.out.println("Address : "+houseNo+" "+street+" "+city+" "+state);
        }
    }
    class DateOfBirth{
        private int day;
        private int month;
        private int year;
        public DateOfBirth(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void displayDOB(){
            System.out.println("Date of Birth : "+day+"/"+month+"/"+year);
        }
    }
    public void display(Address address, DateOfBirth dob){
        System.out.println("Name : "+name);
        System.out.println("Phone : "+phone);
        address.displayAddr();
        dob.displayDOB();
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Person person = new Person("Mohd Sohaib", "+91 (801) 0000 000");
        Address address = person.new Address("H0021", "C012", "Aligarh", "U.P.");
        DateOfBirth dob = person.new DateOfBirth(20, 04, 2000);
        person.display(address, dob);
    }
}
