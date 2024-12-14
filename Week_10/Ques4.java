package Week_10;

class ObjectOriented{
    public void abstraction() {
        System.out.println("Abstraction: Hiding implementation details and showing only essential features.");
    }
    public void polymorphism() {
        System.out.println("Polymorphism: Ability of an object to take many forms.");
    }
    public void inheritance() {
        System.out.println("Inheritance: Mechanism to acquire properties and behavior of a parent class.");
    }
}

class JavaLanguage extends ObjectOriented{
    public void persistence() {
        System.out.println("Persistence: Ability to store and retrieve data permanently.");
    }
    public void interfaces() {
        System.out.println("Interfaces: Contracts that define the behavior a class must implement.");
    }
}

class CppLanguage extends ObjectOriented {

    public void template() {
        System.out.println("Template: Blueprint for creating generic functions or classes.");
    }

    public void friendFunction() {
        System.out.println("Friend Function: Allows a non-member function to access private and protected members of a class.");
    }
}

public class Ques4 {
    public static void main(String[] args) {
        JavaLanguage java = new JavaLanguage();
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();
        CppLanguage cpp = new CppLanguage();
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.template();
        cpp.friendFunction();
    }
}
