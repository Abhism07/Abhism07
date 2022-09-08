import java.util.*;
class hamming
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the data code:");
int d[]=new int[4];
for (int i=0;i<4;i++)
{
d[i] =sc.nextInt();
}
int p[]=new int[3];
p[0] = d[0]^d[1]^d[3];
p[1] = d[0]^d[2]^d[3];
p[2]=d[1]^d[2]^d[3];

int c[]= new int[7];
System.out.println("complete code word is");
c[0]=p[0];
c[1]=p[1];
c[2]=d[0];
c[3]=p[2];
c[4]=d[1];
c[5]=d[2];
c[6]=d[3];

for (int i=0;i<7;i++)
{
System.out.println(c[i]+"");
}
System.out.println("Enter the recieved code:");
int r[]=new int[7];
for(int i=0;i<7;i++)
{
r[i]=sc.nextInt();
}
int pr[]=new int[3];
int rd[] =new int[4];

pr[0]=r[0];
pr[1]=r[1];
rd[0]=r[2];
pr[2]=r[3];
rd[1]=r[4];
rd[2]=r[5];
rd[3]=r[6];

int s[]=new int[3];
s[0]=pr[0]^rd[0]^rd[1]^rd[3];
s[1]=pr[1]^rd[0]^rd[2]^rd[3];
s[2]=pr[2]^rd[1]^rd[2]^rd[3];

int dec=(s[0]*1)+(s[1]*2)+(s[2]*4);
if(dec==0)
System.out.println("NO error");
else
{
System.out.println("Error is at"+dec);
if(r[dec-1]==0)
r[dec-1]=1;
else
r[dec-1]=0;
}
System.out.println("corrected code is:");
for (int i=0;i<7;i++)
System.out.println(r[i]+"");
}
}


