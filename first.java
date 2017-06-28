public class individual {
    public static void main(String ar[])throws Exception
{
int n1,a,t;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
int ar1[]=new int[n1];
for(int i=0;i<n;i++)
ar1[i]=sc.nextInt();
for(int i=0;i<n1;i++)
{
for(int j=i+1;j<n1;j++)
{
if(ar1[i]>ar1[j])
{
t=ar1[i];
ar1[i]=ar1[j];
ar1[j]=t;
}
}
}
for(int i=0;i<n1-1;i++)
{
if(ar1[i]==ar1[i+1])
{
    i++;
    continue;
}
else
System.out.println(ar[i]);
}

}
}
