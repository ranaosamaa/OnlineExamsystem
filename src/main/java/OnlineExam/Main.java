package OnlineExam;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin(1111,"Admin1","admin1Pass");
        Admin admin2 = new Admin(1112,"Admin2","admin2Pass");
        Admin.admins[0]=admin1;
        Admin.admins[1]=admin2;
        Student student1 = new Student(2221,"Student1","student1Pass");
        Student student2 = new Student(2222,"Student2","student2Pass");
        Student student3 = new Student(2223,"Student3","student3Pass");
        Student student4 = new Student(2224,"Student4","student4Pass");
        Student student5 = new Student(2225,"Student5","student5Pass");
        Student.studentsList.add(student1);
        Student.studentsList.add(student2);
        Student.studentsList.add(student3);
        Student.studentsList.add(student4);
        Student.studentsList.add(student5);
        Instructor instructor1 = new Instructor(3331,"Instructor1","instructor1Pass");
        Instructor instructor2 = new Instructor(3332,"Instructor2","instructor2Pass");
        Instructor.instructorsList.add(instructor1);
        Instructor.instructorsList.add(instructor2);


        Scanner in = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String userName = in.nextLine();
        System.out.println("Enter Password: ");
        String password = in.nextLine();
        UserType type=null;
        System.out.println("Choose User Type: ");
        System.out.println("1. Admin");
        System.out.println("2. Instructor");
        System.out.println("3. Student");
        try {
            type = switch (in.nextInt()) {
                case 1 -> UserType.Admin;
                case 2 -> UserType.Instructor;
                case 3 -> UserType.Student;
                default -> type;
            };
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid user type (Number From 1-3): ");
        }
        User.logIn(userName,password,type);

    }
}