import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";

        int index= string1.indexOf(" ");


        String sub1 = string1.substring(0 , index);
        String sub2 = string1.substring(index+1);

        sub1= sub1.toUpperCase();
        string2=string2.toUpperCase();
        sub2=sub2.toUpperCase();

        char[] charArray = (sub1+ " " + string2 + " " + sub2 ).toCharArray();
        System.out.println(charArray);






    }
}