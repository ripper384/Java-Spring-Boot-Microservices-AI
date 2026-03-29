package Java_16_Access_Modifiers;

import Java_16_Access_Modifiers.NestedLevel1.Test1;

public class AccessTestProgram2 {
    public static void main(String[] args) {
        AccessTestProgram1 atp1 = new AccessTestProgram1() ;
        atp1.pid = "sdfxub4543" ;
        atp1.show() ;

        Test1 ts1 = new Test1() ;
        ts1.value = 45 ;
        ts1.show() ;
    }
}
