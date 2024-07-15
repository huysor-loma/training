package absctract;

public class HowToUseAbstract extends AbstractExample{
    @Override
    public void doAction(String greet, String user) {
        System.out.println("Say : "+greet+" to : "+user);
    }

    public void aboutAbstractExampleClass() {
        System.out.println("This is from How to use abstract class 1");
    }
    public void aboutAbstractExample(String str){
        System.out.println("Something about this how use to class :"+str);
    }
}

