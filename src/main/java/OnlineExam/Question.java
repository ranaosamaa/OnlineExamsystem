package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Question implements Serializable, FileHandler<Question>{
    private String questionText;
    private String[] options = new String[4];
    private String correctAnswer;
    private String studentAnswer;
    private static ArrayList<Question> questionBank = new ArrayList<>();
    private double mark;
    private static final File questionFile =new File("questionBankF.bin");


    public Question (){}

    public Question (String questionText, String[] options, String correctAnswer, String studentAnswer, double mark){
        this.questionText=questionText;
        this.options=options;
        this.correctAnswer=correctAnswer;
        this.studentAnswer=studentAnswer;
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
        return options;
    }
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
    public static void setQuestionBank(List<Question> questionBank){
        Question.questionBank=(ArrayList<Question>) questionBank;
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

    public File saveToFile(File questionFile, ArrayList<Question> questionBank) {

        return FileHandler.super.saveToFile(questionFile, questionBank);
    }


    public ArrayList<Question> loadFromFile(File questionFile, ArrayList<Question> questionBank){
        return FileHandler.super.loadFromFile(questionFile, questionBank);
}

}
