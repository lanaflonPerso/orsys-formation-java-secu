import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.PrivilegedAction;

public class Main {
    public static void main(String[] args) {
        LoginContext lc;
        try {
            lc = new LoginContext("TP1");
            lc.login();
            Subject.doAs(lc.getSubject(), new PrivilegedAction<String>() {
                @Override
                public String run() {
                    String userHome = TP1.userHome();
                    System.out.println("userHome = " + userHome);
                    return userHome;
                }

            });
            lc.logout();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }
}
