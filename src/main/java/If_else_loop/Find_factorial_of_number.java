//6. Write  a program to find the factorial of a given number
package If_else_loop;
import java.util.Scanner;
public class Find_factorial_of_number {
    public static void main(String[] args) {
        int fact=1; int i; int input;
        System.out.println("Enter a number for factorial");
        Scanner nu=new Scanner(System.in);
        input=nu.nextInt();
        for(i=1;i<=input;i++)
        {
            fact*=i;

        }

        System.out.println("Tha factorial of" +input);
        System.out.println("\n" +fact);
    }
}
