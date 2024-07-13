import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
       
    System.out.println("enter a number : ");
    int a =  sc.nextInt();

    System.out.println("enter b number: ");
    int b = sc.nextInt();
    Swap_number(a,b);
    }

    static void Swap_number(int a,int b){
        int temp = a ;
        a = b;
        b=temp;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
    }
}