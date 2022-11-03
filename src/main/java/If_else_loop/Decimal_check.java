/* . Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241 */
package If_else_loop;
import java.util.Scanner;
public class Decimal_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        int a, b;
        System.out.println("INPUT YOUR NUMBER");
        num1 = sc.nextFloat();
        num1 = num1 * 100;
        num2 = sc.nextFloat();
        num2 = num2 * 100;
        a = (int) num1;
        b = (int) num2;
        if (a == b) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
