package Java_14_This_Super_Method;

class A{
    public A(){
        super() ;
        System.out.println("default constructor of the class A is called");
    }
    public A(int x){
        super() ;
        System.out.println("Parametrized constructor in A is called");
    }

}
class B extends A{
    public B(){
        System.out.println("default constructor of the class B is called");
    }
    public B(int a){
        super(85623) ;
        System.out.println("Parameterized constructor of the class B is called");
    }
    public B(int x , int y){
        this(8525) ;
        System.out.println("contructor with this executes");
    }
}
public class Lec1_This_Super {
    public static void main(String[] args) {
        B obj = new B(45,85) ;
    }
}


/*In java by default like john cena each and every class extends to the object class which we
* can't see by normal eyes but we just use the functionality.*/
/*In JAVA this() method is used to call the  contructor of the same class */
