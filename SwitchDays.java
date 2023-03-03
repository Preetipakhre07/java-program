import java.util.Scanner;
class SwitchDays{


         public static void main(String args[])

         {

           Scanner pp=new Scanner(System.in);
           System.out.println("enter a num");
           int day=pp.nextInt();


           System.out.println(
                 switch(day)

                 {

         case 1,8->"Sunday";

         case 2,9->"Monday";

         case 3,10->"Tuesday";

         case 4->"Wednesday";

         case 5->"Thursday";

         case 6->"Friday";

         case 7->"Saturday";

         default->"Invalid";

                      }
                       );
  }




}