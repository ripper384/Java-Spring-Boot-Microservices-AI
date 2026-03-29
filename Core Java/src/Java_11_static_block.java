class Mobile1{
    String brand ;
    int price ;
    static String name ;
    static String carid ;


    static{
        name = "Phone-Nokia"  ;
        System.out.println("static block executed!");
        /*It runs once  at the beginning of after the class loader executes*/
    }
    static{
        carid = "sdfsghRSTSG55" ;
    }

    /*Remember static varible exectues synchronously not parallely one by one but once only at the beginning of the
    * execution after the loading procedures of the class is completed*/

    public Mobile1(String brand , int price){
        this.brand  = brand ;
        this.price = price ;
    }
}
public class Java_11_static_block {
    public static void main(String[] args) {
//        Mobile1 mb1 = new Mobile1("samsung" , 85) ;
//
//        System.out.println(Mobile1.name);
//        System.out.println(mb1.brand);
//        System.out.println(mb1.price);

        // static block not executes if class is not loading
        // If we not initialize the class variable then class loader will not load

        // we can make the class loader to get loaded by initializing the static variable or calling it
        System.out.println(Mobile1.name);

        // Another method to do the same is using the Class.forName() method :
//        Class.forName("Mobile1") ;




        /*Variable naming convention :

        * class and interfaces : Calc , Remote , Car -- > starting letter should be capital
        * variable and method : marks  , show() -- > all small caps
        * constants : PIE , BRAND -- > all uppercase
        * multi-worded-variables :MakeMyTrip  -- > camelCase
        * */

    }
}
