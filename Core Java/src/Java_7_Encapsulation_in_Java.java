class Human{

    private int age ;
    private String name ;

    public  Human(int age , String name){
       this.age = age  ;
       this.name = name ;
    }
    public void display(){
        System.out.println("age : "+age);
        System.out.println("name :"+name);
    }
}

public class Java_7_Encapsulation_in_Java {
    public static void main(String[] args) {
        Human obj = new Human(24 , "aditya") ;
        obj.display();
    }
}
