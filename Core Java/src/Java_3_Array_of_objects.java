import java.util.Scanner;
class Student{
    int rollno , marks ;
    String name ;
}

public class Java_3_Array_of_objects {
    public static void main(String[] args) {
        System.out.println("Enter the  no. of students:") ;
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Student std_arr[] = new Student[n] ;

        for(int i=0 ; i < n ; i++){
            Student temp_stud = new Student() ;
            temp_stud.marks = sc.nextInt();
            sc.nextLine() ;
            temp_stud.name = sc.nextLine() ;

            temp_stud.rollno = sc.nextInt();

            std_arr[i] = temp_stud ;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println("Details of Student"+(i+1)) ;
            System.out.println("------------------------------------------------------------");
            System.out.println("Name : "+std_arr[i].name) ;
            System.out.println("Roll no : "+std_arr[i].rollno);
            System.out.println("Marks : "+std_arr[i].marks);
        }
    }
}
