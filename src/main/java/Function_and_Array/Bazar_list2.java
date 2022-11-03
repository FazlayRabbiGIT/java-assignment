package Function_and_Array;

import java.util.HashMap;
import java.util.Scanner;
public class Bazar_list2 {

    public static void main(String[] args) {
        Bazar_list2 set=new Bazar_list2();

        HashMap<String,Integer> list = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        Bazar_list2 obj= new Bazar_list2();
        list.put("exit", 00); // for exit rulse
        list.put("apple", 200);
        list.put("orange", 150);
        list.put("pen", 10);
        list.put("book", 500);
        list.put("rice", 60);
        list.put("suger", 100);
        System.out.println("Enter the item you search and  for  exit the program  enter exit");
        obj.searchItem();

    }
    public  void searchItem( ) {
        HashMap<String,Integer> list = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        String item; boolean exist = true; int sum = 0;
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
