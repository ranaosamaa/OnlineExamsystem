package OnlineExam;

import java.io.*;

abstract public class User implements Serializable {

   protected int userId;
   protected String userName;
   protected String password;
   protected UserType userType;

   public boolean logIn(String userName, String Password){
      return false;
   };
}
