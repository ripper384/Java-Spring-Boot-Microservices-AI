

public class Java_4_Strings {
    public static void main(String[] args) {
        String name = new String("method") ;// dynamic declaration of the string in the java.
        System.out.println(name);

        // accessing the character of the strings :
        System.out.println(name.charAt(0));

        // concatenation in the string :
        name = name+"ksh" ;
        System.out.println(name.concat("reddy"));
    }
}
