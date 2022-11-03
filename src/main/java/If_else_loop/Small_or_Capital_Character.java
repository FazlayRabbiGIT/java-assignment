//1. Write a program to check if inputted letter is small or capital
package If_else_loop;
import java.util.Scanner;
public class Small_or_Capital_Character {
    public static void main(String[] args) {
        char ch ;
 Scanner sc =new Scanner(System.in);
        System.out.println("Pleas Input a character ");
        ch =sc.next().charAt(0);
        if(ch>='a'&& ch<='z'){
        System.out.println(+ch+ "This is a small character");}
        else if(ch>='A' && ch<='Z'){
                System.out.println(+ch+ "This is capital character");}
        else  {
            System.out.println("input is not a character");

        }
    }

    }
