import java.util.Scanner;
class PatterntoprintX
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int x=0;
for(int i=0;i<a-1;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(" ");
}
System.out.print("*");
for(int k=0;k<(2*(a-2)+1)-(2*i);k++)
{
System.out.print(" ");
}
System.out.print("*");
System.out.print("\n");
}
while(x<2)
{
for(int b=1;b<a;b++)
{
System.out.print(" ");
}
System.out.print("*"+"\n");
x++;
}
for(int y=0;y<a-1;y++)
{
for(int z=0;z<(a-2)-y;z++)
{
System.out.print(" ");
}
System.out.print("*");
for(int w=0;w<(2*y)+1;w++)
{
System.out.print(" ");
}
System.out.print("*");
System.out.print("\n");
}
}
}


