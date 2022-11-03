/*4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
package if_else_loop; */
import java.util.Scanner;
public class Check_balance {
    public static void main(String[] args) {
        int balance; int wmoney=0; int value;
        Scanner sc=new Scanner(System.in);
        balance=50000;
        System.out.println("current balance  Is" +balance);
        System.out.println("if you want to withdraw Money enter  1  /n if you want to not withdraw Money 0");
        value=sc.nextInt();
        if(value ==1) {
            System.out.println("Enter the amount to withdraw");
            wmoney = sc.nextInt();
            balance -= wmoney;
            System.out.println("Now Current balance is " + balance);
        }
        else {
        System.out.println("No withdraw");
        }








    }
}
