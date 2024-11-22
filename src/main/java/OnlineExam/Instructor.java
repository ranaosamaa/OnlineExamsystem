package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Instructor extends User implements FileHandler<Instructor> {
    protected static ArrayList<Instructor> instructorsList = new ArrayList<Instructor>();
    private ArrayList<Student> students = new ArrayList<>();
    private static File instructorsFile =new File("instructorsF.bin");

    public Instructor() {
        this.userType = UserType.Instructor;
    }
    public Instructor(int userId, String userName, String password) {
        this.userType = UserType.Instructor;
        this.userId = userId;
        this.userName = userName;
        this.password = password;

    }
    public void addQuestion(Exam e){
        Question q = new Question();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Question Text: ");
        String questionText = in.nextLine();
        q.setQuestionText(questionText);
        for(int op=0; op<q.options.length; op++) {
            System.out.println("Enter option "+ (op+1)+" text: ");
            q.options[op] = op+1 +". "+ in.nextLine();
        }
        System.out.println("Enter Correct Answer: ");
        String correctAnswer = in.nextLine();
        q.setCorrectAnswer(correctAnswer);
        System.out.println("Enter Mark for This question: ");
        double mark = in.nextDouble();
        q.setMark(mark);
        e.questions.add(q);
       boolean alrExists=false;
       for(int i=0; i<Question.questionBank.size(); i++){
           if(q==Question.questionBank.get(i))
               alrExists=true;
       }
       if(!alrExists)
         Question.questionBank.add(q);
    }

    public void removeQuestion (Exam e, Question q){
        e.questions.remove(q);
    }

    public void addExam(){
        Exam e = new Exam();
        Random rand = new Random();
        int random = rand.nextInt(Question.questionBank.size());
        e.setExamId(rand.nextInt(1000,9999));
        for(int q=0; q<20; q++)
            e.questions.set(q, Question.questionBank.get(random));
        e.setFullMark(20);
        e.setSubject("Default Subject");
        Exam.examList.add(e);
    }
    public void removeExam (Exam e){
        Exam.examList.remove(e);
    }

    public File saveToFile() {
        return FileHandler.super.saveToFile(instructorsFile, instructorsList);
    }

    public ArrayList<Instructor> loadFromFile() {
        return FileHandler.super.loadFromFile(instructorsFile, instructorsList);
    }

    public String toString() {
        return this.userType+"\t"+this.userName + "\t" + this.userId + "\t" + this.students;
    }

    @Override
    public void displayMenu() {

    }
}
