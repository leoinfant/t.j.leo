import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the digit of numbers:");
		int n1=s1.nextInt();
		int rn=0;
		int temp=0;
		while(n1>0){
			temp=n1%10;
			rn=rn*10+temp;
			n1=n1/10;
		}
		
		System.out.println(+rn);
	}

}
