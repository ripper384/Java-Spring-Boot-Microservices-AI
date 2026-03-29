package Java_21_Wrapper_Classes;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7 ;
        Integer num1 = num ;  // autoboxing : storing the primitive value and putting into the Integer box.
        int num2 = num1.intValue() ; // unboxing  getting value from the object type to primitive

        Double  d = 45.5632 ;


        double d1 = d.intValue() ;
        System.out.println(d1);

        d1=d.doubleValue() ;
        System.out.println(d1);

        System.out.println(num2);


        // converting string into the int usig the pareInt () method :

        String str = "12" ;
        int num3 = Integer.parseInt(str) ;
        double x = Double.parseDouble(str) ;
        System.out.println(num3*3);
        System.out.println(x);

    }
}
