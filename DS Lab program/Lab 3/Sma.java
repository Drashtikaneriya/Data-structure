import java.util.Scanner;

public class Sma{
    public static void main(String[] args) {
    
     Scanner sc =   new Scanner(System.in);
     System.out.println("enter number of elemnet:");
     int n =  sc.nextInt();
    
     int[] numbers = new int[n];
     System.out.println("Enter the numbers:");
     for (int i = 0; i < n; i++) {
         numbers[i] = sc.nextInt();
     }  
     
     int minPos = 0;
     int maxPos = 0;

     for (int i = 1; i < n; i++) {
         if (numbers[i] < numbers[minPos]) {
             minPos = i;
         }
     }
        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[maxPos]) {
            maxPos = i;
         }
      }


     System.out.println("The smallest number is at position: " + (minPos + 1));
     System.out.println("The largest number is at position: " + (maxPos + 1)); 


    }
}