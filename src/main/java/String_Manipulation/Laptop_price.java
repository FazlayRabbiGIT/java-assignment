package String_Manipulation;
//3 //. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
public class Laptop_price {
    public static void main(String[] args) {

        String str =" Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price? ";
        str=str.replaceAll("[^\\d]" ," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String [] arr =(str.split(" "));
        double laptop_price=Double.parseDouble(arr[1]);
        double vat=Double.parseDouble(arr[2]);
        double Vat_payment =(laptop_price*10)/100;
       // System.out.println(Vat_payment);
        Double  total=laptop_price+Vat_payment;
        System.out.println("Total price of laptop \t "+total);

      //  System.out.println(arr[1]);
       // System.out.println(arr[2]);

    }
}
