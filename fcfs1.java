import java.io.*;
import java.util.Scanner;
class FCFS
{
public static void main(String args[])
{
int i,no_p,burst_time[],WT[],TAT[];
 float avg_wt=0,avg_tat=0;
 burst_time =new int[50];
TAT = new int[50];
WT= new int[50];
Scanner s = new Scanner(System.in);
System.out.println("\n Enter the number of processes:");
no_p = s.nextInt();
System.out.println("\n Enter the burst time:");
for (i=0;i<no_p;i++)
{
System.out.print("\tp"+(i+1)+":");
burst_time[i]=s.nextInt();
}

for(i=1;i<no_p;i++)
{
WT[i] = WT[i-1] + burst_time[i-1];
avg_wt+=WT[i];
}
avg_wt/=no_p;
for(i=0;i<no_p;i++)
{
TAT[i] = WT[i] + burst_time[i];
avg_tat+=TAT[i];
}
avg_tat/=no_p;

System.out.println("Processes \t Burst time \t Waiting time \t Turn around time");
for(i=0;i<no_p;i++)
{
System.out.println("\tp"+(i+1)+"\t"+burst_time[i]+"\t\t"+WT[i]+"\t\t"+TAT[i]);
}
System.out.println("\n");
System.out.println("\nAverage waiting time:"+avg_wt);
System.out.println("\nAverage turn around time:"+avg_tat);
}
}
