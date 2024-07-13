import java.util.Scanner;

public class Lab3_C20_SortNames {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n to store n names");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter name"+(i+1)+" ");
            names[i] = sc.next();
        }
        for (int i = 0; i < (n-1); i++){
            for (int j = 0; j < (n-1); j++){
                if (names[i].charAt(0) > names[i+1].charAt(0)){
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                }
                // if (names[i].charAt(0) == names[i+1].charAt(0)){
                //     if (names[i].charAt(0) > names[i+1].charAt(0)){
                //         String temp = names[i];
                //         names[i] = names[i+1];
                //         names[i+1] = temp;
                //     }
                // }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(names[i]+" ");
            //names[i] = sc.next();
        }
    }
}
