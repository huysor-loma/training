package encapsulation_and_overloading;

public class Main {
    public static void main(String[] args) {
        ClassAndEncapsulationExample classAndEncapsulationExample = new ClassAndEncapsulationExample();
        classAndEncapsulationExample.setAge(20);
        classAndEncapsulationExample.setName("Kid");
        classAndEncapsulationExample.outPut();
        System.out.println("Properties name have value :"+classAndEncapsulationExample.getName());
        System.out.println("Properties age have value :"+classAndEncapsulationExample.getAge());

        System.out.println("The value of from sum 6,7 is :"+classAndEncapsulationExample.sum(6,7));
        System.out.println("The value of from sum 6.5,7.5 is :"+classAndEncapsulationExample.sum(6.5,7.5));
    }
}
