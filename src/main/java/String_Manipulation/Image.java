package String_Manipulation;
/*7. Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3 */
public class Image {
    public static void main(String[] args) {
        String [] image ={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg" };
        int count=0;
        for (String result:image) {
            if (result.contains(".jpg") || (result.contains(".png"))) {
                count++;
            }
        }
        System.out.println(count);
}}
