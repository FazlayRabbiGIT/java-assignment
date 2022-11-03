package String_Manipulation;
/* Replace "R" from Rahim with "F" from the given String:
         Input: Ratul and Rahim lives in Rangpur
         Output: Ratul and Fahim lives in Rangpur */
public class Replace_R_to_F {
    public static void main(String[] args) {
        String input="Ratul and Rahim lives in Rangpur";
        char [] ch=input.toCharArray();
        ch[10]='F';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++)
        {
         sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
