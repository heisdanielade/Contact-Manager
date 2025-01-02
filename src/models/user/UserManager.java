package models.user;

public class UserManager {

    public boolean registerUser(String username, String email, String password){
        System.out.println("(e) User registration failed.");
        return false;
    }

    public int loginUser(String username, String password){
        System.out.println("(e) User login failed.");
        return -1; // if login failed
    }

    public boolean deleteUser(String username, String password){
        System.out.println("(i) User deleted successfully.");
        return false;
    }

}
