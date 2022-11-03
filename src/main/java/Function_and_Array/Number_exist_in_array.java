/*1. Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8] */

package Function_and_Array;
import java.util.Scanner;
public class Number_exist_in_array {
    public static void main(String[] args) {
        int num[] ={ 1,3,5,7,2,4,6,8};
        System.out.println("Enter a number ");
        Scanner s =new Scanner(System.in);
        int search=s.nextInt();
        for( int i=0;i<num.length;i++){
            if ((num[i])==search) {
                System.out.println( search +"\t Is exists\t"+ i +" position" );
            }

        }

    }
}
