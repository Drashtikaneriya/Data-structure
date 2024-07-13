import java.util.Scanner;
public class Lab3_C19_PascalTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of lines for the Pascal triangle: ");
        int n = sc.nextInt();
        
        for (int line = 0; line < n; line++) {
            for (int space = 1; space <= n - line; space++)
                System.out.print(" ");

            int C = 1;

            for (int i = 0; i <= line; i++) {
                System.out.print(C+" ");
                C = C * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }
}
