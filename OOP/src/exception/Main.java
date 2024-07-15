package exception;

public class Main {
    public static void main(String [] args){
        // this try catch concept is use for avoid terminate application when the runtime
         try
         {
             System.out.println("The result between this 5,6 is ="+sum(9,9));
         }
         catch (Exception e){
             System.out.println(e.getLocalizedMessage()+"is reason for error");
         }finally {
             System.out.println("This sum of these value not error");
         }

    }
    static int sum(int a, int b) throws Exception{
        if(a<=0 && b<=0){
            throw new Exception();
        }
        return a+b;
    }
}
