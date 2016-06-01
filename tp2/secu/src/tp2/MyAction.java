package tp2;

import java.security.AccessControlException;
import java.security.PrivilegedAction;

public class MyAction implements PrivilegedAction<String> {

	private String propName;
	
	public MyAction(String propName) {
		this.propName = propName;
	}
	
	public String run() {
		try {
			return propName + ": " + System.getProperty(propName);
		} catch (AccessControlException e) {
			return propName + ": ACCES INTERDIT";
		}
	}

}
