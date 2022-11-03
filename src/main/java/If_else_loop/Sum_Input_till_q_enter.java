/*  9. Write a program to sum of user input until users input ‘q’ from keyboard       */
package If_else_loop;
import java.util.Scanner;
public class Sum_Input_till_q_enter {
    public static void main(String[] args) {

        int num;int sum=0 ;int i=1; char ch;
       // System.out.println("input number to continue or enter q to quit");
      //  System.out.println("enter number"+i+" = ");
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("Enter Number "+i+" = ");
            sum+=s.nextInt();
            System.out.println("Total\t" +sum);
           // System.out.println("Do you want to continue? ");
            ch=s.next().charAt(0);
            i++;
        }
        while(ch!='q');


    }
}
