package tp2;

import java.util.Map;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

public class SimpleLoginModule implements LoginModule {
	private Subject subject;
	private CallbackHandler callbackHandler;
	private SimplePrincipal principal;
	private String username;
	private boolean succeeded = false;
	private boolean commitSucceeded = false;
	
	public void initialize (Subject s, CallbackHandler cb, Map sharedMap, Map options) {
		subject = s;
		callbackHandler = cb;
	}

	/*
	 * Phase 1 de l'authentification
	 * @see javax.security.auth.spi.LoginModule#login()
	 */
	public boolean login() throws LoginException {
		Callback[] callbacks = {
			new NameCallback("Nom ? : "),
			new PasswordCallback ("Mot de passe ? : ", true)
		};
		try {
			callbackHandler.handle(callbacks);
			NameCallback nameCallback = (NameCallback)callbacks[0];
			PasswordCallback passwordCallback = (PasswordCallback)callbacks[1];
			username = nameCallback.getName();
			String password = new String(passwordCallback.getPassword());
			succeeded = (("toto".equals((username)) || "titi".equals(username)) && username.equals(password));
			return succeeded;
		} catch (Exception e) {
			succeeded = false;
			return false;
		}
	}

	/*
	 * Phase 2 de l'authentification, confirmation
	 * @see javax.security.auth.spi.LoginModule#commit()
	 */
	public boolean commit() throws LoginException {
		if (!succeeded) {
			username = null;
			return false;
		}
		principal = new SimplePrincipal(username);
		if (!subject.getPrincipals().contains(principal)) {
			subject.getPrincipals().add(principal);
		}
		username = null;
		commitSucceeded = true;
		return true;
	}

	public boolean abort() throws LoginException {
		if (!succeeded)
			return false;
		else if (commitSucceeded)
			logout();
		else {
			succeeded = false;
		}
		return true;
	}

	public boolean logout() throws LoginException {
		subject.getPrincipals().remove(principal);
		principal = null;
		username = null;
		succeeded = commitSucceeded = false;
		return true;
	}

}
