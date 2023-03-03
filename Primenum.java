import java.util.Scanner;
class Primenum



 public static void main(String[] args) 
{

    int a, i, num=0;
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter a Number:");
a=sc.nextInt();

for(i=2; i<a; i++)
{
if(a%i ==0)
{
num++;
break;
}
}
if (num==0)

    
      System.out.println( "This  is a prime number.");
    else
      System.out.println( " This is not a prime number.");
  }
}
   

