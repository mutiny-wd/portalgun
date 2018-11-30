package model.vo;
//用户类
public class User {
    public int ID;
    public String UserName;
    public String UserEmail;
    public String UserPassWord;
    public String UserNumber;
    public byte UserSex;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassWord() {
        return UserPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        UserPassWord = userPassWord;
    }

    public String getUserNumber() {
        return UserNumber;
    }

    public void setUserNumber(String userNumber) {
        UserNumber = userNumber;
    }

    public byte getUserSex() {
        return UserSex;
    }

    public void setUserSex(byte userSex) {
        UserSex = userSex;
    }

    public User(String userName, String userEmail, String userPassWord, String userNumber, byte userSex) {
        UserName = userName;
        UserEmail = userEmail;
        UserPassWord = userPassWord;
        UserNumber = userNumber;
        UserSex = userSex;
    }
}
