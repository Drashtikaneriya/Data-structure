
import java.util.Scanner;

public class Recursion_Factorial {
   public Recursion_Factorial() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter Number");
      int var2 = var1.nextInt();
      int var3 = Factorial(var2);
      System.out.println(var3);
   }

   static int Factorial(int var0) {
      return var0 == 1 ? 1 : var0 * Factorial(var0 - 1);
   }
}
