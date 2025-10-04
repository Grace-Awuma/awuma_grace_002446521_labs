package Business.UserAccounts;
import Business.Profiles.Profile;
import java.util.ArrayList;

public class UserAccountDirectory {
    
    ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        useraccountlist = new ArrayList();
    }
    
    public UserAccount newUserAccount(Profile p, String un, String pw) {
        UserAccount ua = new UserAccount(p, un, pw);
        useraccountlist.add(ua);
        return ua;
    }
    
    // Find by username (for sign-up duplicate check)
    public UserAccount findUserAccount(String username) {
        for (UserAccount ua : useraccountlist) {
            if (ua.isMatchUsername(username)) {
                return ua;
            }
        }
        return null;
    }
    
    // Find by PersonId (keep original skeleton method)
    public UserAccount findUserAccountByPersonId(String personId) {
        for (UserAccount ua : useraccountlist) {
            if (ua.isMatch(personId)) {
                return ua;
            }
        }
        return null;
    }
    
    // Authentication
    public UserAccount AuthenticateUser(String un, String pw) {
        for (UserAccount ua : useraccountlist) {
            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
        return null;
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return useraccountlist;
    }
}