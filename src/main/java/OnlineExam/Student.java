package OnlineExam;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Student extends User implements FileHandler<Student> {

    private ArrayList<Exam> studentResults;
    protected static ArrayList<Student> studentsList;
    private static File studentsFile =new File("studentsF.bin");

    public Student() {
        this.userType = UserType.Student;
    }
    public Student(int userId, String userName, String password) {
        this.userType = UserType.Student;
        this.userName = userName;
        this.password = password;
        this.userId = userId;
        this.studentResults = new ArrayList<>();

    }

    public void takeExam(Exam exam) {

    }

    public Exam submitExam() {
        return null;
    }

    public void viewResults(ArrayList<Exam> exams) {
        for(Exam exam : exams) {
            System.out.println("Exam Id: "+exam.getExamId()+"  Exam Grade: "+exam.getGrade()+"/"+exam.getFullMark());
        }
    }

    public static ArrayList<Student> getStudentsList() {return studentsList;}
    public static void setStudentsList(ArrayList<Student> studentsList) {Student.studentsList = studentsList;}
    public ArrayList<Exam> getStudentResults() {return studentResults;}
    public void setStudentResults(ArrayList<Exam> studentResults) {this.studentResults = studentResults;}


    public File saveToFile() {
        return FileHandler.super.saveToFile(studentsFile, studentsList);
    }

    public ArrayList<Student> loadFromFile() {
        return FileHandler.super.loadFromFile(studentsFile, studentsList);
    }
    public String toString() {
        return this.userType+"\t"+this.userName + "\t" + this.userId + "\t" + this.studentResults;
    }

    @Override
    public void displayMenu() {

    }
}
