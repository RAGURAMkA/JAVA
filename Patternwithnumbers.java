import java.util.Scanner;
class Patternwithnumbers
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int k=0;
for(int i=0;i<a;i++)
{
for(int j=0;j<i+1;j++)
{
System.out.print(k);
k=k+1;
}
System.out.print("\n");
}
}
}
