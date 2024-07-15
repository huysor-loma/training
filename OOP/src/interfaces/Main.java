package interfaces;

public class Main {
    public static void main(String[]args){
        InterfaceExample interfaceImpl1= new InterfaceImpl1();
        InterfaceExample interfaceImpl2= new InterfaceImpl2();
        interfaceImpl1.doAction();
        interfaceImpl2.doAction();
    }
}
