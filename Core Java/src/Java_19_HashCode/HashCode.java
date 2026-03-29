package Java_19_HashCode;

class Laptop{
    String model ;
    int price ;
}
public class HashCode {

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga" ;
        obj.price = 1000 ;

        System.out.println(obj) ;
        System.out.println(obj.toString());
    }
}
