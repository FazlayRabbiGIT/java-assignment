/* 6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: admin@123 */

package Function_and_Array;
import java.util.Scanner;
public class Logging_system {
    public static void main(String[] args) {
        int i=0;
        String adminName="admin";
        String adminPass="admin@123";
        Scanner sc=new Scanner(System.in);
        while (i<3){
            System.out.println("You  input " +i +"  Times");
            System.out.println("Enter Name :");
            String inputName=sc.nextLine();
            System.out.println("Enter password");
            String inputPass=sc.nextLine();

            if(  (adminName.equals(inputName))==true  && (adminPass.equals(inputPass))==true ) {
                System.out.println( "Logging Sucessfull");
                break;
            }
            else {
                System.out.println("Name and password not match");
                i++;
                 if (i==3){
                     System.out.println("Your user has been temporary locked");
                     break;
                 }

            }


        }


    }



}
