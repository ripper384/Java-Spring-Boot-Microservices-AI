class Computer{
    public void playMusic(){
        System.out.println("music player") ;
    }
    public int getPen(){
        return 45 ;
    }
}


public class Methods_in_Java {
    public static void main(String[] args) {
        Computer comp = new Computer() ;
        comp.playMusic();
        System.out.println(comp.getPen()) ;
    }
}

