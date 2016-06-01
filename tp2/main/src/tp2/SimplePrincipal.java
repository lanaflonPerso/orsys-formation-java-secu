package tp2;

import java.io.Serializable;
import java.security.Principal;

public class SimplePrincipal implements Principal, Serializable {
	private String name;
	
	public SimplePrincipal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean equals (Object o) {
		if (o instanceof Principal) {
			return (((Principal)o).getName().equals(name));
		} else return false;
	}
	
	public String toString() {
		return super.toString()+" "+name;
	}
}
