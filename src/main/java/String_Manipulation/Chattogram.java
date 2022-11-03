package String_Manipulation;

import java.sql.SQLOutput;
import java.util.Locale;

//4. Writea program that will give following output:
//Input: chattogram
//Output: C8M
public class Chattogram {
    public static void main(String[] args) {
        String myString="chattogram";
        String s1=String.valueOf(myString.charAt(0)).toUpperCase();
        String last= String.valueOf(myString.charAt(myString.length()-1)).toUpperCase();
        int len=myString.length()-2;
        //System.out.println(myString.length());
        System.out.println(s1+len+last);

    }
}
