// THREAD CLASS

class A extends Thread{
    public void run(){                 //thread class will always run with run() method , run method will always be public
        for (int i=0; i<=20; i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i=0; i<=20; i++){
            System.out.println("Hello");
        }
    }
}

class Threads{
    public static void main (String[] args){
        A obj1= new A();
        B obj2 = new B();

        //obj2.setPriority(Thread.MAX_PRIORITY);   //to set priority of the threads(obj1/2)
        //obj2.setPriority(70);

        obj1.start();            //  start function needs to be called while using run method
        obj2.start();
    } 

}

//***************************************************************** */

//  SLEEP AND TRY CATCH

class C extends Thread{
    public void run(){                
        for (int i=0; i<=20; i++){
            System.out.println("Wo");


            try {
                Thread.sleep(10);              // --> just to sync the outputs 
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
class D extends Thread{
    public void run(){
        for (int i=0; i<=20; i++){
            System.out.println("Hooo");
        }
    }
}

class Thh{
    public static void main (String[] args){
        C obj1= new C();
        D obj2 = new D();

        obj1.start();            //  start function needs to be called while using run method
        obj2.start();
    } 

}


//***************************************************************** */

//  RUNNABLE INTERFACE
// runnable interface dont take thread methods, therefore first object of thread class need to  be made to use its methods.

class E implements Runnable{
    public void run(){                
        for (int i=0; i<=20; i++){
            System.out.println("Wo");
        }
    }
}
class F implements Runnable{
    public void run(){
        for (int i=0; i<=20; i++){
            System.out.println("Hooo");
        }
    }
}

class Thrr{
    public static void main (String[] args){
        Runnable obj1= new E();                // Referance of the interface, object of the class
        Runnable obj2 = new F();        

        Thread t1= new Thread(obj1);           // Thread takes runnable object as an argument
        Thread t2= new Thread(obj2);

        t1.start();                            // start function belongs to the thread class object.        
        t2.start();
    } 

}


