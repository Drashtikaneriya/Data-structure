import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter elemnet: ");

        int x= sc.nextInt();

        System.out.println("enter index :");

         int y = sc.nextInt();

        System.out.println("enter length of array: ");

        int  n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0; i<n ; i++){

         a[i]= sc.nextInt();

        }

        int b[] =  new int[n+1];

        for(int i = 0; i<n+1 ; i++){

            if(i==y){

                b[i]=x;

            }
            else if (i<y){

                b[i]=a[i];

            }
            else if(i>y){

                b[i]=a[i-1];
            }

        }

        System.out.println("---------------------------------");

        for(int i=0;i<n+1;i++){

            System.out.println(b[i]);
        }
    }
}