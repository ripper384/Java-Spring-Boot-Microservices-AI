package Java_20_Upcasting_Downcasting;

class A{
    public void show1(){
        System.out.println("in show A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in show B");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
//        A obj1 = (B) new B() ;
//        obj1.show2() ;    // illegal downcasting , still the reference is the A so the compiler will
        // see the A only


        A obj1 = new B() ;   // upcasting
        B obj2 = (B) obj1 ; // downcasting :

        obj2.show2();



    }
}
