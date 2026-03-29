class Human1{
    private String name ;
    private int age ;
    private int fav_num = 999 ;


    public Human1(){
        System.out.println("DEFAULT CONSTRUCTOR INVOKED");
        System.out.println("value of the this:"+this);
    }
    public Human1(int age , String name){
        this.age = age ; this.name = name ;
        System.out.println("2nd CONSTRUCTOR INVOKED");
    }
    public Human1(String name , int age){
        this.name = name ; this.age = age ;
        System.out.println("3rd CONSTRUCTOR INVOKED");
    }
    public Human1(int age , String name , int fav_num){
        this.age = age ; this.name = name ; this.fav_num = fav_num ;
        System.out.println("4th CONSTRUCTOR INVOKED");
    }
}
public class Java_8_this_keyword {
    public static void main(String[] args) {
        Human1 hm1 = new Human1() ;
        Human1 hm2 = new Human1(10 , "harry") ;
        Human1 hm3 = new Human1("mia" , 45) ;
        Human1 hm4 = new Human1(12 , "shreya" , 89) ;


    }
}
