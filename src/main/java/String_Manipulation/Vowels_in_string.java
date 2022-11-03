package String_Manipulation;
//"5. Write a program that will count how many vowels in the given string:\n" +
  //      "\"roadtosdet\"\n" +
  //      "Output: 4"
public class Vowels_in_string {
    public static void main(String[] args) {
        String word="roadtosdet"; int count=0;
        char ch[]=word.toCharArray();
        char vowels[]={ 'a','e','i','o','u'};
        for(int i = 0;i<ch.length; i++) {
            for (int j = 0; j<vowels.length; j++) {
                 if(ch[i]==vowels[j]) {
                     count++;       }

            }
        }

        System.out.println("Total Vowels\t "+count);
    }
}
