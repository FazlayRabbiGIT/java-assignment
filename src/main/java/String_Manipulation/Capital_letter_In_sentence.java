package String_Manipulation;
/*8. Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet */
public class Capital_letter_In_sentence {
    public static void main(String[] args) {
        String myString="rahim lives in sylhet" ;
        String word[] =myString.split(" ");
        for(int i=0;i< word.length;i++){
        String fastLetter=String.valueOf(word[i].charAt(0));
        String restletter=word[i].substring(1);
        System.out.println(fastLetter.toUpperCase()+""+restletter);
    }
}
}
