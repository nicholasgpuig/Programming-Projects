import java.util.Scanner;
public class finalproj
{
   public static void main(String args[])
   {
      
      Scanner speedInput = new Scanner(System.in);
      System.out.println("Enter in your speed: ");
      int speed = speedInput.nextInt();
      if (speed > 60)
         System.out.println("Hey you're speeding! You get a $200 ticket!");
      else if (speed == 60)
         System.out.println("You're going at the speed limit; be careful not to go over");
      else if (speed > 50 && speed < 60)
        System.out.println("You're under the speed limit but you're going on the fast side");
      else
         System.out.println("You're under the speed limit but going a bit slow");
         
      
      System.out.println("Enter a number in: ");
      double deci = speedInput.nextDouble();
      if (deci >= 100)
        System.out.println("Please enter a number lower than 100");
      else if (deci < 0)
        System.out.println("Please enter a positive number");
      else {
        int integ = (int)deci;
        for (;integ <= 100; integ++){
          if (integ < 33)
            System.out.println(deci + " " + integ + " There is no char for this integer");
          else{
          char letter=(char)integ;
          System.out.println(deci + " " + integ + " " + letter);
          deci++;
          }
        }
        }
      
      
   }      
}
//enter in data and count to xyz
