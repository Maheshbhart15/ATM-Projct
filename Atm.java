import java.util.*;
import java.util.Scanner;
 
 public  class Atm
{
  public static void main(String args[])
   {
     int bal=5000,withdraw,deposit,n;
     int pin=8766;
     Scanner s=new Scanner(System.in);
     Scanner keyboard=new Scanner(System.in);
     System.out.println("   ***welcome to ATM**  ");
     System.out.println("   Insert card  ");
     System.out.println(" Enter Your PIN ");
     int entry=keyboard.nextInt();
     while(entry!=pin)
      {
       System.out.println("\n Incorrect PIN .........Try Again :");
       System.out.println("Enter Your PIN :");
       entry=keyboard.nextInt();
       }
   
    do
{
System.out.println("  1.Withdrawal : ");      
System.out.println("  2.Deposit : ");
System.out.println("  3.Balance status :"); 
System.out.println("  4.Transfers and payments :");
System.out.println("  5.Exit ");
System.out.println("  Enter your choose : ");

n=s.nextInt();
 
switch(n)
{
 case 1:System.out.print(" Enter money to Withdarw : ");
 withdraw=s.nextInt();
if(bal>withdraw)
 {
  bal=bal-withdraw;
  System.out.print("Please collect your money :");
  }
  else
  System.out.print(" Insuffient Balance :");
   System.out.print(" ");
break;


case 2:System.out.print(" Enter money to be Deposit :");
deposit=s.nextInt();
bal=bal+deposit;
System.out.print(" your money Deposited ");
System.out.println(" ");
break;


case 3:System.out.print("bal="+bal);
System.out.println(" ");
break;

case 4:System.out.print(" contact to bank for detailes of Transfer and payments :");
break;

case 5:System.exit(0);
}
}
while(n!=5);
}
}
