import java.util.Scanner;
class fibr
{
static int a=0,b=1,sum=0,c;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
c=sc.nextInt();
System.out.println("\t0");
fibb(c-1);
}
static void fibb(int count)
{
if(count>0)
{
System.out.println("\t"+sum);
sum=a+b;
a=b;
b=sum;
fibb(count-1);
}
}
}