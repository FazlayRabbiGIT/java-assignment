package String_Manipulation;
/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
        then 400 tk will be discounted. After your purchase what will be your total cost? */
public class Shirt_and_Sharee {
    public static void main(String[] args) {
        double total;
        String str= "Price of a formal shirt is 1200 tk and Sharee is 3500 tk." +
                " If you buy 2 shirt and 1 sharee, then 400 tk will be discounted";
        str=str.replaceAll( "[^\\d]", " ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        //System.out.println(str);
        String []arr =(str.split(" "));
        double shirt_price=Double.parseDouble(arr[0]);
        System.out.println(arr[0]);
        double sharee_price=Double.parseDouble(arr[1]);
        total=(shirt_price*2+sharee_price )-400;


        System.out.println("Total price"+total);


    }
    
}
