public class Exception {
    public static void main(String[] args){ 
     int b=5; int c;
     try {
        System.out.println("Try Start");
         c= 100/b;
         System.out.println(c);
        System.out.println("Try ends");
     }catch(ArithmeticException e){
        System.out.println(e.getMessage()+" Cannot be divided by zero: ");
     }
     finally{
        System.out.println("Finally printed");
     }
}
}
//******************************************** */
class ThrowsExecp {
 
    public void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
}
class A{
    public  static void main (){
        ThrowsExecp th = new ThrowsExecp();
        try {
            th.fun();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
//******************************************** */

public class AgeException{
    public  void vAge(int age) throws InvalidAgeException{
        if (age <18){
            throw  new InvalidAgeException;
        }
    }

        public static void main (String[] args){
           AgeException aa  = new AgeException();

           try{
            aa.vAge(15);
            System.out.println("above age");
           }
            catch (InvalidAgeException e){
            System.out.println("under age");
         }
    }
}
        class InvalidAgeException extends Exception{
            public InvalidAgeException(){}
        }
    



