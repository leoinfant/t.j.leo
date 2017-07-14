import java.io.*;
import java.util.*;
class CKP_Tower_Of_Hanoi
{
    static void HanoiLogic(int d,char a,char b,char c)
    {
        if(d==1)
        {
            System.out.println("MOVING THE DISK 1 FROM "+a+" TO "+b);
            return;
        }
        HanoiLogic(d-1,a,c,b);
        System.out.println("MOVING THE DISK "+d+" FROM "+a+" TO "+b);
        HanoiLogic(d-1,c,b,a);
    }
    public static void main(String[] args)
    {
        int num;
        char A='A',B='B',C='C';
        System.out.println("ENTER THE NUM OF DISK:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        HanoiLogic(num,A,B,C);
    }
}
