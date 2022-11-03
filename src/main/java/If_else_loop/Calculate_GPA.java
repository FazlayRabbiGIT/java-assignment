// 2. Write a program to calculate GPA and find grade
package If_else_loop;

import java.util.Scanner;
public class Calculate_GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cgpa; float avg; float tnum=0;
        System.out.println("Input Number of total subject");
        int tsub = sc.nextInt();
        System.out.println(" Now input number of the subject");
        for (int i= 0;i<tsub;i++) {
            tnum =tnum+ sc.nextFloat();

        }
        System.out.println("total number" +tnum);
        avg=tnum/tsub;
        System.out.println("Student grade is ");
        if(avg>=80) {
            System.out.println("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("B");
        } else if (avg>=50 && avg<60) {
            System.out.println("C");

        } else if (avg>=40 && avg<50) {
            System.out.println("D");

        } else  {
            System.out.println("F");

        }

    }
    }
