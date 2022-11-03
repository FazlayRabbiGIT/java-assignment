//7. Write a program to print prime numbers from 2 to n
package If_else_loop;

import java.util.Scanner;
public class Prime_numbers_2_to_n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for prime number");
        int n = s.nextInt();
        for (int i=2; i<=n; i++) {
            int count=0;
            for (int j=1;j<= n;j++)
                if (i % j==0) {
                    count++;
                }
            if (count==2) {
                System.out.println(i);
            }


        }
    }
}