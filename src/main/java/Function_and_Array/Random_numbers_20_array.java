//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)
package Function_and_Array;

import java.util.Random;

public class Random_numbers_20_array {
    public static void main(String[] args) {
        Random_numbers_20_array obj=new Random_numbers_20_array();
        int i=0; int array[] =new int[20];
        Random rand =new Random();

        while(i<20){
            int randomNumber=rand.nextInt(99) +1;
            array[i]=randomNumber;
            System.out.println(array[i]);
            i++;
        }
          obj.F_max(array);
          obj.F_min(array);
          obj.F_duplicate(array);
    }
    public void F_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
             if(array[i]>max)
             {
                 max=array[i];
             }

        }
        System.out.println("The max number is  "+max);
    }

    public void F_min(int[] array) {
        int min= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min)
            {
                min=array[i];
            }

        }
        System.out.println("The max number is  "+min);
    }





    public void F_duplicate(int[] array) {

        for (int i = 0; i < array.length; i++) {
           for(int j=i+1 ;j<array.length;j++){
               if (array[i] == array[j]) {
                   System.out.println("Found duplicate :"+array[i]);
               }

           }

        }
        System.out.println("exit");
    }







}
