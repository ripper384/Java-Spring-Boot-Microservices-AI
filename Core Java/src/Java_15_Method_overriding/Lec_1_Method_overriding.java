package Java_15_Method_overriding;

class A{
    public int addFirstNterms( int n){
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            sum+=i ;
        }
        return sum;
    }
    public  void config(){
        System.out.println("In a config of the A");
    }
}
class B extends A{
   public int addFirstNterms(int n){
       return (n*(n+1)/2);
   }
}

public class Lec_1_Method_overriding {
    public static void main(String[] args) {
        B b = new B() ;
        System.out.println(b.addFirstNterms(5));
    }
}
