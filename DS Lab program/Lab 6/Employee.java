import java.util.Scanner;

class  Employee_Detail{
    int Employee_id;
    String name ;
    int salary;
    String designation;
}
public class Employee {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Employee_Detail e = new Employee_Detail();
     System.out.println("enter name : ");
     e.name = sc.nextLine();
     System.out.println("enter designation: ");
    e.designation=sc.nextLine();
    System.out.println("enter id :");
    e.Employee_id= sc.nextInt();
    System.out.println("enter salary : ");
    e.salary= sc.nextInt();

    System.out.println("id:"+e.Employee_id);
    System.out.println("name:"+e.name);
    System.out.println("designation: "+e.designation);
    System.out.println("salary:"+e.salary);
    }
}
