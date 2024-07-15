package encapsulation_and_overloading;

public class ClassAndEncapsulationExample {

//    The definition of encapsulation is a technique that used for prevent the accessing directly class attribute
    private int age;
    private String name;
    public int getAge(){
       return this.age;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

    public void outPut(){
        System.out.println("ClassAndEncapsulationExample properties have {" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}');
    }


    // this is overloading method
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
}
