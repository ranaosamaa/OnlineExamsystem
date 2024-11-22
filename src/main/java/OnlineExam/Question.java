package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Question implements Serializable, FileHandler<Question>{
    private String questionText;
    protected String[] options = new String[4];
    private String correctAnswer;
    private String studentAnswer;
    protected static ArrayList<Question> questionBank = new ArrayList<>();
    private double mark;
    private static File questionFile =new File("questionBankF.bin");


    public Question (){questionBank.add(this);}

    public Question (String questionText, String[] options, String correctAnswer, double mark){
        this.questionText=questionText;
        this.options=options;
        this.correctAnswer=correctAnswer;
        this.mark=mark;
        questionBank.add(this);
    }

    public String getQuestionText (){
        return questionText;
    }
    public void setQuestionText(String questionText){
        this.questionText=questionText;
    }
    public String[] getOptions(){
        for(int op=0; op<this.options.length; op++)
            System.out.println(op+1 +". "+ options[op]);
        return options;}
    public void setOptions(String[] options){
        this.options=options;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer){
        this.correctAnswer=correctAnswer;
    }
    public String getStudentAnswer(){
        return studentAnswer;
    }
    public void setStudentAnswer(String studentAnswer){
        this.studentAnswer=studentAnswer;
    }
    public static List<Question> getQuestionBank(){
        return questionBank;
    }
    public static void setQuestionBank(ArrayList<Question> questionBank){
        Question.questionBank= questionBank;
    }
    public double getMark(){
        return mark;
    }
    public void setMark(double mark){
        this.mark=mark;
    }

    public boolean isCorrect() {
        return correctAnswer.equals(studentAnswer);
    }

    public File saveToFile() {

        return FileHandler.super.saveToFile(questionFile, questionBank);
    }


    public ArrayList<Question> loadFromFile(){
        return FileHandler.super.loadFromFile(questionFile, questionBank);
}
    public String toString(){
//        System.out.println(questionText)
//    for(int op=0; op<this.options.length; op++)
//            System.out.println(op + 1 + ". " + this.options[op]);
//        return " ";
        return questionText + "\n" +Arrays.toString(options);}
}
