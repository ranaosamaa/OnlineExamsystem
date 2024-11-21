package OnlineExam;

import java.io.*;

abstract  public class User implements Serializable {

   protected int userId;
   private String userName;
   private String password;
   private UserType userType;

   public abstract boolean logIn(String userName, String Password);
}
