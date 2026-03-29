class Mobile{
    String brand  ;
    int price ;
    static String name ;

    public void show1(){
        System.out.println("price:"+price + " "+brand+" "+name);
    }
    public static void show(){
//        System.out.println("price:"+price + " "+brand+" "+name); // we can't call the non-static variable from the static method
        // but we can call static variable from the non-static method.
          System.out.println("name : "+name) ;
    }

}
public class Java_10_static_method {
    public static void main(String[] args) {

        Mobile mb = new Mobile() ;
        Mobile.name = "toyota-5ccdi" ;
        mb.brand = "toyota" ; mb.price = 45 ;
        mb.show1();
        // we can call the static method directly by class name  :
        Mobile.show();

    }
}
