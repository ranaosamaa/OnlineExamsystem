package OnlineExam;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Student extends User implements FileHandler<Student> {

    private ArrayList<Exam> studentResults;
    private static ArrayList<Student> studentsList;
    private static final File studentsFile =new File("studentsF.bin");

    public Student() {}
    public Student(int userId) {
        this.userId = userId;
        this.studentResults = new ArrayList<>();
    }

    public void takeExam(Exam exam) {

    }

    public Exam submitExam() {
        return null;
    }

    public void viewResults(ArrayList<Exam> exams) {

    }

    // getters and setters
    public static ArrayList<Student> getStudentsList() {return studentsList;}
    public static void setStudentsList(ArrayList<Student> studentsList) {Student.studentsList = studentsList;}
    public ArrayList<Exam> getStudentResults() {return studentResults;}
    public void setStudentResults(ArrayList<Exam> studentResults) {this.studentResults = studentResults;}

    @Override
    public boolean logIn(String userName, String Password) {
        return false;
    }

    public File saveToFile(File studentsFile, ArrayList<Student> studentsList) {
        return FileHandler.super.saveToFile(studentsFile, studentsList);
    }

    public ArrayList<Student> loadFromFile(File studentsFile, ArrayList<Student> studentsList) {
        return FileHandler.super.loadFromFile(studentsFile, studentsList);
    }
}
