package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Exam implements Serializable, FileHandler<Exam> {
    private int examId;
    protected ArrayList<Question> questions;
    private String subject;
    private Timer timeLimit;
    private double fullMark;
    protected double grade;
    protected static ArrayList<Exam> examList=new ArrayList<>();
    private static File examFile =new File("exams.bin");


    public Exam(){}

    public Exam (int examId, ArrayList<Question> questions,String subject,Timer timeLimit,double fullMark){
        this.examId=examId;
        this.questions =questions;
        this.subject=subject;
        this.timeLimit=timeLimit;
        this.fullMark=fullMark;
        examList.add(this);
    }

    public int getExamId(){
        return this.examId;
    }
    public void setExamId(int examId){
        this.examId=examId;
    }
    public ArrayList<Question> getQuestions(){
        return questions;
    }
    public void setQuestions(ArrayList<Question> questions){
        this.questions=questions;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public Timer getTimeLimit(){
        return timeLimit;
    }
    public void setTimeLimit(Timer timeLimit){
        this.timeLimit=timeLimit;
    }
    public double getFullMark(){
        return fullMark;
    }
    public void setFullMark(double fullMark){
        this.fullMark=fullMark;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public static List<Exam> getExamList(){
        return examList;
    }
    public static void setExamList(List<Exam> examList){
        Exam.examList=(ArrayList<Exam>) examList;
    }


    public File saveToFile() {
        return FileHandler.super.saveToFile(examFile, examList);
    }


    public ArrayList<Exam> loadFromFile() {
        return FileHandler.super.loadFromFile(examFile, examList);
    }
    public String toString(){
        return examId+"\n"+subject+"\n"+timeLimit+"\n"+fullMark+"\n"+grade+"\n"+"\n"+questions+"\n";
    }
}
