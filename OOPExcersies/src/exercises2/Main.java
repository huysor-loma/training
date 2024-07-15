package exercises2;

import exercise1.Person;

public class Main {
    public static void main(String[] args){
        Dog dog= new Dog("Dojo","Huskey");
        System.out.println(dog);
        dog.setName("JoJo");
        System.out.println("This after update name");
        System.out.println(dog);
    }
}
