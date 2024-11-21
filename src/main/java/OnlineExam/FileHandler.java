package OnlineExam;
import java.io.*;
import java.util.ArrayList;

public interface FileHandler<T> {
    public default File saveToFile(File file, ArrayList<T> list) {
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(fo);

            o.writeObject(list);
            o.close();
            fo.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("File Not Found!!!");
        } catch (IOException ioe) {
            System.out.println("Error Initializing stream");
        }

        return file;
    }
    public default ArrayList<T> loadFromFile(File file, ArrayList<T> list){
        try {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream i = new ObjectInputStream(fi);

            list= (ArrayList<T>) i.readObject();
            i.close();
            fi.close();
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class Not Found!!!");
        } catch (IOException ioe) {
            System.out.println("Error Initializing stream");
        }

        return list;
    }
}
