import java.util.Scanner;
import java.util.Random;
public class finalproj
{
   public static void main(String args[])
   {
      
      Scanner speedInput = new Scanner(System.in);
      System.out.println("Enter in your speed: ");
      int speed = speedInput.nextInt();
      if (speed > 60)
         System.out.println("Hey you are speeding! You get a $200 ticket");
      else if (speed == 60)
         System.out.println("You're going at the speed limit");
      else
         System.out.println("You're going under the speed limit :)");
         
      Random randgen = new Random();
      System.out.println("Enter an upper limit: ");
      int randbase = speedInput.nextInt();
      if (randbase >= 1000)
         System.out.println("Number must be less than 1000");
      else if (randbase < 0)
         System.out.println("Number must be positive");
      int randnum = randgen.nextInt(randbase);
      System.out.println(randnum);
   }      
}