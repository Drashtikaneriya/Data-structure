import java.util.Scanner;

public class Lab2_C9_Time {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in secoends to convert it into HH:MM:SS");
        int time = sc.nextInt();

        int hour=0,min=0,sec=0;

        // if (time < 60){
        //     sec = time;
           // System.out.println("00:00:"+time);
        //}
        // else if (time >= 60){
            hour = (int)(time/3600);
            int rem = time % 3600;
            min = (int)(rem/60);
            sec = rem % 60;
        //}
        // else if (time >= 60){
        //     int min = (int)(time/60);
        //     int sec = time % 60;

        //     System.out.println("00:"+min+":"+sec);
        // }

        System.out.println(hour+":"+min+":"+sec);
    }
}
