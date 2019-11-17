import java.util.Scanner;
class Permutation
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x,count=0,y,z,w,k=0,m,n,summa=0;
int j=1;
for(int i=1;i<a;i++)
j=j*10;
for(int i=j;i<j*10;i++)
{
w=i;
while(w!=0)
{
m=w%10;
n=w/10;
while(n!=0)
{
if(n%10==m)
{
k=1;
w=0;
}
n=n/10;
}
w=w/10;
}
if(k==0)
{
z=i;
while(z!=0)
{
x=b;
y=z%10;
while(x!=0)
{
if(x%10==y)
{
x=0;
count++;
}
else if(x==0)
{
z=0;
}
x=x/10;
}
z=z/10;
}
if(count==a)
{
System.out.println(i);
summa++;
}
count=0;
}
k=0;
}
System.out.println("total no. of possibilities is"+" "+summa);
}
}




