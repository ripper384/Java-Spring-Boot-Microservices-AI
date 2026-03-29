import java.sql.SQLOutput;

class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In a show") ;
    }
}
public class Java_12_Anonymous_Object {
    public static void main(String[] args) {
        new A() ; // anonymous object

        /*
        * Here we can see that there is no object variable no variable is created inside the stack
        * only the A() get created inside the heap
        */

        // we cannot use it multiple times as it will creat newer object each and every time :
        new A().show();
    }
}
