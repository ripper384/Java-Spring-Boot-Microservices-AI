package Java_13_Inheritance;

import Java_13_Inheritance.ParentCalculator.Calc;

class ScientificCalc extends Calc{
    public void show() {
        CONTTEMP = 8566;
        System.out.println(CONTTEMP);
    }
}
public class Learn_Inhertiance_1 {
    public static void main(String[] args) {
        ScientificCalc obj = new ScientificCalc() ;
        int sum = obj.add(7,8) ;
        int sub = obj.sub(89,-963) ;
        obj.show();



        System.out.println(sum + " " + sub);
    }
}
