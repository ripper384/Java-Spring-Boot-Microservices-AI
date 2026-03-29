class SatPhn{
    String sat_id ;
    int phn_num ;
    String asso_name ;

    static String contractor_name ;
    /*static variables are those variable which can be accessed without making a object of it and it
    * same for the every objects and we can say it like a global instance variable for everyone which is
    * static in nature*/
}


public class Java_9_static {
    public static void main(String[] args) {
        SatPhn op1 = new SatPhn() ;
        op1.asso_name = "rexa"  ; op1.phn_num = 4525369 ; op1.sat_id = "xu75sgs" ;
        SatPhn.contractor_name = "RK-SATELLITE-SERVICE.Ltd" ;

        SatPhn op2 = new SatPhn() ;
        op2.asso_name = "mzdo" ; op2.phn_num = 7854225 ; op2.sat_id = "opd65SX" ;
        System.out.println(op1.asso_name);
        System.out.println(op1.sat_id);
        System.out.println(op1.phn_num);

        System.out.println(SatPhn.contractor_name); // static variable is accessed using the class name it can be accessed using the object variable as well
        SatPhn.contractor_name = "rahul-sat-service" ;
        System.out.println(SatPhn.contractor_name);
    }
}
