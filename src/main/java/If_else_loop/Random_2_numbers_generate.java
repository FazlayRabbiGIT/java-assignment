/*8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved. */
package If_else_loop;

import java.util.Scanner;
public class Random_2_numbers_generate {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int input ;
        int count=0;
        int rnum1=(int)(Math.random()*10) ;
        int rnum2=(int)(Math.random()*10);
        for(int i=1;i<=10;i++){
            System.out.println("you  enter input\t" +i);
            System.out.println("times");
            input=sr.nextInt();
            if(input==rnum1 || input==rnum2 )
                count++;
        }
        System.out.println("Random number\t"+rnum1);
        System.out.println("Random number\t"+rnum2);
        System.out.println("Total score "+count);
    }
}
