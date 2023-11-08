// Abtract class with both methods
abstract class A{
    A(){                                                //abstract constructor (semi colon)
        System.out.println(" constructor of A ");
    }
    abstract void a();                                  //abstract method
    
    public void c(){                                    // non abstract method
        System.out.println("its a non abstract method ");
    }
}
class B extends A{
    public void a(){
        System.out.println(" abstract method inherited ");
    }
}


public class AbstractInterface {
    public static void main(){
        B obj1=  new B();
        obj1.a();
        obj1.c();

    }
}

//****************************************************************** */

//interface with multiple inheritance

interface X{
    void x();      // abstract method in interface
}
interface Y{
    void y();
}
class Z implements X, Y{      // implementing both the interfaces

      public void x(){        // implementing abstract method is necessary
            System.out.println("abstract methid 1 ");
      }
      public void y(){
            System.out.println(" Abstract method 2 ");
      }
}
public class AbstractInterface {
    public static void main(){
         X xx =  new Z();     // object of class , reference of interface
         Y yy = new Z();
        xx.x();
        yy.y();

    }
}
//abstract class can implement interface but it can't be vice versa.
