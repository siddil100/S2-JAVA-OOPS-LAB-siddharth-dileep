import java.util.*;

class Person {      //multilevel without using super
    String name;
    String gender;
    String address;
    int age;

    Person() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of person: ");
        name=sc.nextLine();
        System.out.print("Enter the gender of person: ");
        gender=sc.nextLine();
        System.out.print("Enter the address of person: ");
        address=sc.nextLine();
        System.out.print("Enter the age of person: ");
        age=sc.nextInt();
    }
}

class Employee extends Person {
    int empid;
    String companyname;
    String qualification;
    int salary;

    Employee() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the empid: ");
        empid=sc.nextInt();
        System.out.print("Enter the company name: ");
        companyname=sc.next();
        System.out.print("Enter the qualification of employee: ");
        qualification=sc.next();
        System.out.print("Enter the salary of employee: ");
        salary=sc.nextInt();
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherid;

    Teacher() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the subject of teacher ");
        subject=sc.nextLine();
        System.out.print("Enter the department of teacher ");
        department=sc.nextLine();
        System.out.print("Enter the teacher id ");
        teacherid=sc.nextInt();
    }

    void put() {
        System.out.println("Person name is: "+name);
        System.out.println("person gender is: "+gender);
        System.out.println("person address is: "+address);
        System.out.println("person age is: "+age);
        System.out.println("employee id is: "+empid);
        System.out.println("employee company is: "+companyname);
        System.out.println("employee qualification is: "+qualification);
        System.out.println("employee salary is: "+salary);
        System.out.println("teacher subject is: "+subject);
        System.out.println("teacher department is: "+department);
        System.out.println("teacher id is: "+teacherid);
    }
}

public class personmulti{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int i,n;
        System.out.println("How many records you want to insert: ");
        n=sc.nextInt();
        Teacher obj[]=new Teacher[n];
System.out.println("enter the details of"+n+" records");
for (i=0;i<n;i++)
{
obj[i]=new Teacher();
}
for(i=0;i<n;i++)
{
obj[i].put();
}
}
}
