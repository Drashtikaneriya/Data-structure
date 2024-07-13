import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Student_detail s[] = new Student_detail[5];

    for(int i = 0 ; i<=5 ; i++){
     s[i] =  new Student_detail();
    
        System.out.println("enter student name :");
        s[i].Name=sc.next();
        System.out.println("enter enrollment no :");
        s[i].Enrollment_No=sc.nextInt();
        System.out.println("enter semester:");
        s[i].Semester= sc.nextInt();
        System.out.println("enter CPI:");
        s[i].CPI =  sc.nextFloat();
    }
    for(int i=0 ; i<5;i++){
        System.out.println("student name ");
        System.out.println(s[i].Name);
        System.out.println("enter enrollment no :");
        System.out.println(s[i].Enrollment_No);
        System.out.println("enter semester:");
        System.out.println(s[i].Semester);
        System.out.println("enter CPI:");
        System.out.println(s[i].CPI);
    }


    }
    
}
class Student_detail {
    int Enrollment_No;
    String Name;
    int Semester;
    float CPI;
    
}
