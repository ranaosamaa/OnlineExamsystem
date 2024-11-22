package OnlineExam;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Admin extends User {
    protected static Admin[] admins= new Admin[2];
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

    @Override
    public void displayMenu() {

    }
}
