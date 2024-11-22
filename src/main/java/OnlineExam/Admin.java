package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Admin extends User {
    public Admin() {
        this.userType=UserType.Admin;
    }
    public Admin(int userId, String userName,String password) {
        this.userType = UserType.Admin;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public String toString() {
        return this.userType+": "+this.userId+"\t"+this.userName+"\t";
    }
}
