/*3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary */
package Function_and_Array;

import java.util.Arrays;

public class Highest_salary {

    public static void main(String[] args) {
        int array1[] = {35000, 25000, 28000, 32500, 44000, 32800 };
        Highest_salary sch=new Highest_salary();
        sch.ascendingSorty(array1);
    }
      public void ascendingSorty(int[] array1) {
          Arrays.sort(array1);
          int size=array1.length;
          System.out.println(size);
          int size2=size-3; //array start from 0 to for last 3dr number  minus 3
          int thirdSalary=array1[size2];
          System.out.println("3rd highest salary = "+thirdSalary);

    }












}
