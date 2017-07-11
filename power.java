import java.util.*;
public class Power {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = 0;
        int p = 0;
        int power = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        System.out.print("Enter power: ");
        p = sc.nextInt();

        System.out.print(power(n,p));
    }
    public static int power(int a, int b)
    {
            int power = 1;
            for(int c=0;c<b;c++)
            power*=a;
            return power;
        }

}
