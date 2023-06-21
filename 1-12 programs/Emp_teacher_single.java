import java.util.Scanner;

class Employee {      //Emp teacher single level
    int empid;
    String name;
    int salary;
    String address;

    Employee(int a, String b, int c, String d)
	{
        empid = a;
        name = b;
        salary = c;
        address = d;
    }
}

class Teacher extends Employee 
{
    String department;
    String subject;

    Teacher(int l, String m, int n, String o, String p, String q) 
	{
        super(l, m, n, o);
        department = p;
        subject = q;
    }
		public void display()
	{
		System.out.println("employee id  is "+empid);
		System.out.println("employee name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Employee address is "+address);
		System.out.println("Teacher department is "+department);
		System.out.println("Teacher subject is "+subject);
	}
}

public class Emp_teacher_single {
    public static void main(String[] args) {
        int i;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the limit of array");
        int n = cin.nextInt();
        Teacher e[] = new Teacher[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the eid of Employee");
            int a = cin.nextInt();
            System.out.println("Enter the name of Employee");
            String b = cin.next();
            System.out.println("Enter the salary of Employee");
            int c = cin.nextInt();
            System.out.println("Enter the address of Employee");
            String d = cin.next();
            System.out.println("Enter the department of teachers");
            String q = cin.next();
            System.out.println("Enter the subject of teachers");
            String f = cin.next();
            e[i] = new Teacher(a, b, c, d, q, f);
			System.out.println("PRINTING DETAILS");
			e[i].display();
        }
    }
}
