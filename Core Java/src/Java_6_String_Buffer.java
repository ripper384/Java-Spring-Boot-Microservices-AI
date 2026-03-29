public class Java_6_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin") ;
        System.out.println(sb.capacity()) ;
        sb.append("Reddy") ;
        System.out.println(sb.capacity());
        sb.append("maiyreyadfdljlskfjslkdfj") ;
        System.out.println(sb.capacity());


        // methods in the stringbuffer :

        // append method  : It allows us to append another string and character into the current string
        StringBuffer st = new StringBuffer("1st_string") ;
        st.append("2nd_string") ;
        System.out.println(st);

        // trying to append the character into the string :
        st.append('4') ;
        System.out.println(st);

        // Add the  character from at the given index:
        sb.insert(0 , "Java") ;
        System.out.println(st);

    }
}
