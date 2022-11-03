/* 10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered. */
package If_else_loop;
import java.util.Scanner;
public class Largest_and_smallest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double largest =0;
        double smallest=0;
        System.out.println("Enter the number (-999 to exit):");
        double number=input.nextDouble();
        if(number!= -999){
         largest=number;
        }
        if(number!= -999){
            smallest=number;
        }
        while(number!= -999){
            if(number<smallest){
                smallest=number;
            }
            if(number>largest){
                largest=number;
            }
            System.out.println("Enter the number (-999 to exit):");
            number=input.nextDouble();
        }
        System.out.println("Largest number is " +largest);
        System.out.println("Smallest number is "+smallest);
    }
}
