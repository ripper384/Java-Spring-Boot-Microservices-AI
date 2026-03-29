public class Java_5_Mutable_Imutable {
    public static void main(String[] args) {
//        String name = "mango" ;
//        String z1 = "banana" ;
//        String x1 = "mango" ;


        String x1 = new String("mango") ;
        String x2 = "mango" ;
        System.out.println("x1 == x2 : "+x1 == x2);
        System.out.println("x1 equals x2 : "+x1.equals(x2));

    }
}
