package Function_and_Array;

import java.util.HashMap;
import java.util.Scanner;
public class Bazar_list {

    public static void main(String[] args) {

        int sum = 0;
        boolean exist = true;
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        list.put("exit", 00); // for exit rulse
        list.put("apple", 200);
        list.put("orange", 150);
        list.put("pen", 10);
        list.put("book", 500);
        list.put("rice", 60);
        list.put("suger", 100);

        System.out.println("Enter the item you search and  for  exit the program  enter exit");

        String item;
        do {
            item = sc.nextLine();
            if (list.containsKey(item) == exist) {
                sum += list.get(item);
                System.out.println("Total amount " + sum);

            } else {
                System.out.println("No item found");
            }
        } while (list.get(item) != 00);

        System.out.println("Total product price " + sum);
    }

}
