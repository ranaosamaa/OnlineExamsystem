package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Instructor extends User implements FileHandler<Instructor> {
    @Override
    public boolean logIn(String userName, String Password) {
        return false;
    }

    @Override
    public File saveToFile(File file, ArrayList<Instructor> list) {
        return null;
    }

    @Override
    public ArrayList<Instructor> loadFromFile(File file, ArrayList<Instructor> list) {
        return null;
    }
}
