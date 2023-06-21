class Common {
    String name;
    String gender;
    int age;
}

class Principal extends Common {
    int salary;
}

class Teacher extends Common {
    String subject;
}

class Student extends Common {
    String grade;
}

public class komon {
    public static void main(String[] args) {
        Principal p1 = new Principal();
        p1.name = "sid";
        p1.gender = "Male";
        p1.age = 45;
        p1.salary = 5000;

        Teacher t1 = new Teacher();
        t1.name = "binu";
        t1.gender = "male";
        t1.age = 35;
        t1.subject = "cs";

        Student s1 = new Student();
        s1.name = "nithin";
        s1.gender = "male";
        s1.age = 15;
        s1.grade = "10th";

        System.out.println("Principal:");
        System.out.println("Name: " + p1.name);
        System.out.println("Gender: " + p1.gender);
        System.out.println("Age: " + p1.age);
        System.out.println("Salary: " + p1.salary);

        System.out.println("Teacher:");
        System.out.println("Name: " + t1.name);
        System.out.println("Gender: " +t1.gender);
        System.out.println("Age: " + t1.age);
        System.out.println("Subject: " +t1.subject);

        System.out.println("Student:");
        System.out.println("Name: " + s1.name);
        System.out.println("Gender: " +s1.gender);
        System.out.println("Age: " + s1.age);
        System.out.println("Grade: " +s1.grade);
    }
}
