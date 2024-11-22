package OnlineExam;

import java.io.*;

abstract public class User implements Serializable {

   protected int userId;
   protected String userName;
   protected String password;
   protected UserType userType;

   Admin admin = new Admin(1111,"ADMIN","adminPass1");

   public abstract void displayMenu();

   public static boolean logIn(String userName, String Password, UserType userType) {
      if (userType == UserType.Student) {
         for (Student s : Student.studentsList) {
            if (s.userName.equals(userName) && s.password.equals(Password)) {
               System.out.println("Login successful");
               s.displayMenu();
               return true;
            }
         }
      } else if (userType == UserType.Instructor) {
         for (Instructor i : Instructor.instructorsList) {
            if (i.userName.equals(userName) && i.password.equals(Password)) {
               System.out.println("Login successful");
               i.displayMenu();
               return true;
            }
         }
      } else if (userType == UserType.Admin) {
         for (Admin a : Admin.admins) {
            if (a.userName.equals(userName) && a.password.equals(Password)) {
               System.out.println("Login successful");
               a.displayMenu();
               return true;
            }

         }
      } else {
         System.out.println("Login failed");
         return false;
      }
      return false;
   }
}
