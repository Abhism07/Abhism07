import java.util.*;
 class A
 {
 public static void main(String args[])
 {
  int n,i,temp;
  System.out.println("Enter the number of proceses:");
  Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
  int p[] = new int[n];
  int a_time[] = new int[n];
 int burst_time []= new int[n];
 int wait_time []= new int [n];

   for( i=0;i<n;i++)
  {
  System.out.println("Enter the arrival  of  process"+(i+1));
  a_time[i] = sc.nextInt();  
  System.out.println("Enter the burst time of  process"+(i+1));
  burst_time[i] = sc.nextInt();
  p[i] = i+1;
  }
  wait_time[0]=0;
  for (i=0;i<n;i++)
  {
   for(int j =0;j<n;j++)
   {
   if(a_time[j] >a_time[j+1])
   {
    temp =a_time[j];
    a_time[j] = a_time[j+1];
    a_time[j+1] =temp;
    
    temp = burst_time[j];
    burst_time[j] = burst_time[j+1];
    burst_time[j+1] =temp ;
   }
   }
  }
  
  System.out.println("process id        arrival time     execution time      ");
  for(i=0;i<n;i++)
  {
    System.out.println( p[i] +"                  "+a_time[i]+"               "+burst_time[i]);
  }
  
 }
 }
