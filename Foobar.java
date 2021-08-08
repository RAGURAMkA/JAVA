//consider a chess board with knight in it. imagine the board numbered from 1 to 64 (1 to 8 in the 1st row ,9 to 16 in the second row.....).get input of the starting ending point.find the minimum no.of steps in which a knight can start from the starting point and reach ending point.
import java.util.*;
class Foobar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=solution(x,y);
        System.out.println(z);
    }
    public static int solution(int src, int dest) {
        int r1,r2,c1,c2;
        r1=(src%8)+1;
        c1=(src/8)+1;
        r2=(dest%8)+1;
        c2=(dest/8)+1;
        if(r2>r1)
            src=r2-r1;
        else
            src=r1-r2;
        if(c2>c1)
            dest=c2-c1;
        else
            dest=c1-c2;
        r1=0;
        r2=0;
        c1=0;
        if(src>=dest)
        {
            r1=src%2;
            src=src/2;
            if(src<=dest)
            {
                r2=src;
                dest=dest-src;
                if(dest>1)
                {
                    c1=dest%2;
                    dest=dest/2;
                    if(dest<=r1)
                    {
                        r2=r2+dest;
                        r1=r1-dest;
                        r1=r1+c1;
                    }
                    else
                    {
                        dest=dest-r1;
                        if(r1!=0)
                            r2=r2+1;
                        dest=dest*2;
                        r1=dest+c1;
                    }
                }
                else
                {
                    if(r1==0||dest==0)
                        r1=r1+dest;
                    else
                        r1=6;
                }
            }
            else
            {
                src=src-dest;
                r2=dest;
                src=src*2;
                r1=r1+src;
            }
        }
        else
        {
            r1=dest%2;
            dest=dest/2;
            if(dest<=src)
            {
                r2=dest;
                src=src-dest;
                if(src>1)
                {
                    c1=src%2;
                    src=src/2;
                    if(src<=r1)
                    {
                        r2=r2+src;
                        r1=r1-src;
                        r1=r1+c1;
                    }
                    else
                    {
                        src=src-r1;
                        if(r1!=0)
                            r2=r2+1;
                        src=src*2;
                        r1=src+c1;
                    }
                }
                else
                {   
                    if(r1==0||dest==0)
                        r1=r1+src;
                    else
                        r1=6;
                }
            }
            else
            {
                dest=dest-src;
                r2=src;
                dest=dest*2;
                r1=r1+dest;
            }
        }
        switch(r1)
        {
            case 0:
                return r2;
            case 1:
                return (r2+3);
            case 2:
                return (r2+2);
            case 3:
                return (r2+3);
            case 4:
                return (r2+2);
            case 5:
                return (r2+3);
            case 6:
                return (r2+4);
            case 7:
                return (r2+7);
        }
        return r2;
    }
}