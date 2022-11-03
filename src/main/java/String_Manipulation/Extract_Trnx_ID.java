package String_Manipulation;
/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456 */
public class Extract_Trnx_ID {
    public static void main(String[] args) {
        String html_body= "<html>\n"+
                   " <title>Test</title>\n"+
                   "<body>\n"+
                  "Your trnx is successful. Trnx Id is: TXN123456\n"+
                  " </body>\n "+
                    "</html>\n" ;
        int pos=html_body.indexOf("TXN");
        String out=html_body.substring(pos,pos+9);
        System.out.println(out);


    }
}
