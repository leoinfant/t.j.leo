import java.util.*;
import java.io.*; 
class Swapeven
{
   public static String swapPairs(String s) {
    String eve = "";
    String odd = "";
    int length = s.length();

    for (int i = 0; i <= length-2; i+=2) {          
        eve += s.charAt(i+1) + "" + s.charAt(i);
    }

    if (length % 2 != 0) {          
        odd = eve + s.charAt(length-1);
        return odd;
    } else {
        return eve;
    }
}
public static void main(String[] args)
{
Swapeven sw= new Swapeven();
System.out.println("given string 'computer' ");
System.out.println(sw.swapPairs("computer"));

}
}
