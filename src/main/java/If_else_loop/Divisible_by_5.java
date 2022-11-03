//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
package If_else_loop;

public class Divisible_by_5 {
    public static void main(String[] args) {

        int i,n;int sum = 0;

        for(i=0;i<=100;i++)
        {
        if(i%5==0)
        {
            sum+=i;
        }
        }
        System.out.println("Sum of numbers which only divisible by 5 from 1 to 100 \n"+sum);

    }
}
