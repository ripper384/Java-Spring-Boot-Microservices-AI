package Java_18_Final_Variable;

final class Calc{
    /*Making class final will not allow user to perform inheritance use the feature in the subclass mean
    * you cannot create  child class.
    * */
    public void show(){

    }
    public void add(int a , int b){
        System.out.println("a+b : "+a+b);
    }
}

class A{
    public final void show(){
        System.out.println("Written by A");
    }
}
class B extends A{
//    public void show(){   // illegal since method overriding is not allowed
//        System.out.println("written by B");
//    }
}

public class FinalVariable {

    public static void main(String[] args) {
        // final makes the variable constant , we can't change the value of it in the future.
        final int x = 55 ;
        // x = 456 ;  illegal we can't change the value because it is constant

        B b = new B() ;
        b.show() ;

        A a = new A() ;
        a.show() ;
    }



    /*
    * Final class  : stops the inheritance
    * Final method : stops method overriding
    * Final variable : stops value modifications
    * */


}
