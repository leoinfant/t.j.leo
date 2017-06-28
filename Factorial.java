import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int n1;
	Scanner n=new Scanner(System.in);	
		int n2=n.nextInt();	
		n1=1;
		for(int i=1;i<=n2;i++){
		n1=n1*i;
		}
		System.out.println(n1);
	}

}
