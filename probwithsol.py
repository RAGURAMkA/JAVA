'''
Practice Submissions
You have not attempted this problem.
Last updated: Apr 19 2020, 21:30

PROBLEM
ANALYSIS
Problem
You have just received the best gift ever: an Expogo stick. You can stand on it and use it to make increasingly large jumps.

You are currently standing on point (0, 0) in your infinite two-dimensional backyard, and you are trying to reach a goal point (X, Y), with integer coordinates, in as few jumps as possible. You must land exactly on the goal point; it is not sufficient to pass over it on a jump.

Each time you use your Expogo stick to jump, you pick a cardinal direction: north, south, east, or west. The i-th jump with your Expogo stick moves you 2^(i-1) units in the chosen direction, so your first jump takes you 1 unit, your second jump takes you 2 units, your third jump takes you 4 units, and so on.

Given a goal point (X, Y), determine whether it is possible to get there, and if so, demonstrate how to do it using as few jumps as possible.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each consists of a single line with two integers X and Y: the coordinates of the goal point.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is IMPOSSIBLE if the goal point cannot be reached. Otherwise, y must be a string of one or more characters, each of which is either N (north), S (south), E (east), or W (west), representing the directions of the jumps that you will make, in order. This sequence of jumps must reach the goal point at the end of the final jump, and it must be as short as possible.

Limits
Time limit: 20 seconds per test set.
Memory limit: 1GB.
(X, Y) ≠ (0, 0).

Test set 1 (Visible Verdict)
1 ≤ T ≤ 80.
-4 ≤ X ≤ 4.
-4 ≤ Y ≤ 4.

Test set 2 (Visible Verdict)
1 ≤ T ≤ 100.
-100 ≤ X ≤ 100.
-100 ≤ Y ≤ 100.

Test set 3 (Visible Verdict)
1 ≤ T ≤ 100.
-109 ≤ X ≤ 109.
-109 ≤ Y ≤ 109.

Sample

Input:
4
 2 3
-2 -3
3 0
-1 1
Output : 
Case #1: SEN
Case #2: NWS
Case #3: EE
Case #4: IMPOSSIBLE

  
In Sample Case #1, you can jump south from (0, 0) to (0, -1), then jump east to (2, -1), then jump north to (2, 3).

We can be sure there is not a more efficient solution (two moves or fewer) because at least 2 + 3 = 5 units of distance are needed to reach the goal point, but the first two jumps combined only give us 3 units of distance.

Notice that Sample Case #2 is like Sample Case #1 but reflected across both axes, and so the answer comes from reflecting all directions in Sample Case #1's answer.

In Sample Case #3, notice that EWE would not be a valid answer, even though it reaches the target, because there is a way to get there using fewer jumps.

We leave it to you to determine why it is impossible to reach the target in Sample Case #4.

'''







def check(x,lis,sum1,n,lis1):
    if x==0:
        return lis1
    for i in range(n,len(lis),+1):
        sum1=sum1+lis[i]
        if sum1==x:
            lis1.append(i)
            return (lis1)
        elif sum1!=x:
            sum1=sum1-lis[i]
        elif sum1!=x and i==len(lis)-1:
            sum1=sum1-lis[i]
            for q in range(n,len(lis),+1):
                sum1=sum1+lis[q]
                lis1=check(x,lis,sum1,n+1,lis1)
                if lis1==[]:
                    sum1=sum1-lis[q]
                else:
                    lis1.append(q)
                    return (lis1)
    return
def column(x,y,i,t):
    lis=[]
    lis1=[]
    z=0
    for j in range (2,i+1,+1):
        lis.append(2**(j-1))
    if x%2==0:
        lis1=check(abs(x),lis,0,0,lis1)
        lis2=[]
        lis3=[]
        z=1
        for o in range(len(lis)):
            if o in lis1:
                lis2.append(o)
            else:
                lis3.append(o)
    elif y%2==0:
        lis1=check(abs(y),lis,0,0,lis1)
        lis2=[]
        lis3=[]
        for p in range(len(lis)):
            if p in lis1:
                lis3.append(p)
            else:
                lis2.append(p)
    if z==1:
        if y<0 and t<0:
            print('S')
        elif y<0 and t>0:
            print('N')
        elif y>0 and t<0:
            print('N')
        elif y>0 and t>0:
            print('S')
    elif z==0:
        if x<=0 and t<0:
            print('W')
        elif x<=0 and t>0:
            print('E')
        elif y>=0 and t<0:
            print('E')
        elif y>=0 and t>0:
            print('W')
    for i in range(len(lis)):
        if i in lis2:
            if x>=0:
                print("E")
            else:
                print("w")
        else:
            if y>=1:
                print("N")
            else:
                print("S")
x_axis=int(input("enter the column"))
y_axis=int(input("enter the row"))
if x_axis%2==0 and y_axis%2==0:
    print("IMPOSSIBLE")
elif x_axis%2!=0 and y_axis%2!=0:
    print("IMPOSSIBLE")
else:
    sum0=abs(x_axis)-1+abs(y_axis)
    sum1=0
    i=2
    j=2
    while(2**(i-1)<=sum0):
        sum1=sum1+2**(i-1)
        if(sum0==sum1):
            column(x_axis,y_axis,i,-1)
            break
        elif 2**(i)>=sum0:
            sum0=sum0+2
            while(2**(j-1)<sum0):
                sum1=sum1+2**(i-1)
                if(sum0==sum1):
                    column(x_axis,y_axis,j,1)
                    break
                elif 2**(i-1)==sum0-1:
                    print("IMPOSSIBLE")
                j=j+1
        i=i+1

