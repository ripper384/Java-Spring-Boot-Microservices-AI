import java.util.Scanner;

public class Java_2_arrays {
    public static void main(String[] args) {
        //creation of the array :

        //hardcoded one :
//        int nums[] = {1,2,3,4,5} ;
//
//        //dynamic array : Initially the value at each of the index inside the array is zero.
//        int arr1[] = new int[5] ;
//        for(int i = 0 ; i < 5 ;i++){
//            System.out.println(arr1[i]) ;
//        }
//        char ch[] = new char[2] ;
//        System.out.println(ch[1]) ;

        // jagged arrays in the java :


        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int jagarr[][] = new int [n][] ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the size of the list you want to add : ") ;
            int size = sc.nextInt() ;
            int temp[] = new int[size] ;
            for(int j = 0 ; j < size ; j++){
                int val = sc.nextInt() ;
                temp[j] = val ;
            }
            jagarr[i] = temp ;
        }

        for(int i = 0 ; i < n ; i++){
            int size = jagarr[i].length ;
            for(int j = 0 ; j < size ; j++){
                System.out.print(jagarr[i][j]+" ") ;
            }
            System.out.println(" ") ;
        }

        // 3d array :


    }


}
