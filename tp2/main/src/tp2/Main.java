package tp2;

import com.sun.security.auth.callback.TextCallbackHandler;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {
        LoginContext lc;
        try {
            lc = new LoginContext("TP2", new TextCallbackHandler());
            lc.login();

            System.out.println(Subject.doAs(lc.getSubject(), new MyAction("user.home")));
            System.out.println(Subject.doAs(lc.getSubject(), new MyAction("java.class.path")));

            lc.logout();

        } catch (LoginException le) {
            throw new RuntimeException(le);
        }
    }
}
