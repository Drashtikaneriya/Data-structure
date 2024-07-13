import java.util.Scanner;

public class A31 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[][] m1 = new int[3][2];
         int[][] m2 = new int[2][3];
         int[][] m3 = new int[3][3]; 

         for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
              System.out.println("enter m1");
                m1[i][j]=sc.nextInt();
            }
         }
         for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
              System.out.println("enter m2");
                m2[i][j]=sc.nextInt();
            }
         }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){

                m3[i][j]+=m1[i][k]*m2[k][j];
                }
                System.out.print(" "+m3[i][j]);
                }
                System.out.println();

            }
         }

    }

