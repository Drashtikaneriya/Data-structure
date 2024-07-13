import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter index of delete number:  ");
        int x = sc.nextInt();

        System.out.println("enter length of array: ");
        int n =  sc.nextInt();
    
        int a[]=new int[n-1];
        for(int i=0;i<n;i++){
            System.out.println("enter element: ");
            a[i]=sc.nextInt();
        }
        int b[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            if(n==x){
                continue;
            }
            else if(i<x){
                b[i] = a[i];

            else if(i>x){
                b[i-1] = a[i];
            }
        }
        System.out.println("--------------------------------------");
        
        for(int i=0;i<n;i++){
            System.out.println(b[i-1]);
         }
     }
  } 
}

