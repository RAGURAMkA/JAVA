import java.util.Scanner;
class Aaaa
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=0;
int p=0;
for(int i=2;i<x;i++)
{
for(int j=1;j<i;j++)
{
if(i%j==0 && j!=1)
{
j=i+1;
}
else if(j==i-1)
{
for(int a=2;a<x;a++)
{
for(int b=1;b<a;b++)
{
if(a%b==0 && b!=1)
{
b=a+1;
}
else if(b==a-1)
{
if(i+a==x && i<=a)
{
n=1;
System.out.println("yes"+"\n"+i+"\n"+a);
p++;
}
}
}
}
}
}
}
if(n==0)
{
System.out.println("no");
}
System.out.println("no. of possibilities is "+p);
}
}
