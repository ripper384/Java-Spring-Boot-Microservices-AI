package Java_17_Dyamic_Dispatch;


class A{

    public void show(){
        System.out.println("inside A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("inside B");
    }
}
class C extends B{
    @Override
    public void show(){
        System.out.println("inside C") ;
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {

         A obj1 = new C() ;
         obj1.show() ;

         obj1 = new B() ;
         obj1.show() ;

         obj1 = new A() ;
         obj1.show() ;


         // remember no  matter what reference variable you have but it actually it depends on the object in the heap
    }
}
