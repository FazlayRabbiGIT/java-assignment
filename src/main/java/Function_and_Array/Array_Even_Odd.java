/*Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers() */
package Function_and_Array;
import java .util.Scanner;
public class Array_Even_Odd {

    public static void main(String[] args) {
        Array_Even_Odd obj =new Array_Even_Odd();
        Scanner sc =new Scanner(System.in);
       int array1[] = new int[5];
       System.out.println("Enter array input" );
      for(int i=0;i<=4;i++) {
          System.out.println("Number " + i + " = ");
          array1[i]= sc.nextInt();
      } 
          obj.average(array1);
          obj.countEvenNumbers(array1);
          obj.countOddNumbers(array1);
    }
     public static void average(int[]array1 ) {
        int sum=0;
        for(int j=0;j<array1.length;j++) {
            sum += array1[j];

        }
         System.out.println("sum is "+sum);
        double aver=(sum/array1.length);
         System.out.println("Average of the array =  "+aver);
     }

     public void   countEvenNumbers(int[] array1) {
        int even=0;
         for(int j=0;j<array1.length;j++) {
             if( array1[j]%2==0){
                 even++;
         }

         }
         System.out.println("Amount of even number ="+even);
     }

     public void  countOddNumbers(int[] array1) {
         int odd=0;
         for(int j=0;j<array1.length;j++) {
             if( array1[j]%2!=0){
                 odd++;
             }

         }
         System.out.println("Amount of odd number ="+odd);
     }


}
