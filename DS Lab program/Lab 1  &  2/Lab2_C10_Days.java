import java.util.Scanner;

public class Lab2_C10_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter days to convert it into year week days");
        int days = sc.nextInt();

        // if (days < 7){
        //     System.out.println(days+"days");
        // }
        // if (days >= 7){
            int year = (int)(days/365);
            //int rem = time % 3600;
            int week = (int)((days%365)/7);
            int day = (days%365) % 7;

            System.out.println(year+"year(s) "+week+"week(s) "+day+"day(s)");
        //}
        // else if (time >= 60){
        //     int min = (int)(time/60);
        //     int sec = time % 60;

        //     System.out.println("00:"+min+":"+sec);
        // }
    }
}
