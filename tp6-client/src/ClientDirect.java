
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;

import com.leuville.fournisseurservice.FournisseurService;
import com.leuville.fournisseurservice.FournisseurService_Service;


public class ClientDirect {

	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){
 
	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}

	public static void main(String[] args) throws Exception {
//		URL wsdlURL = new URL("http://localhost:8080/tp6/services/fournisseurService?WSDL");
		URL wsdlURL = new URL("https://localhost:8443/tp6/services/fournisseurService?WSDL");
		
		FournisseurService_Service service = new FournisseurService_Service(wsdlURL);
		FournisseurService port = service.getFournisseurServiceSOAP(new AddressingFeature());
//		FournisseurService port = service.getFournisseurServiceSOAP();

//		List<Handler> handlers = new ArrayList<Handler>();
//		handlers.add(new LogHandler());
//		((BindingProvider) port).getBinding().setHandlerChain(handlers);

		Map<String,Object> ctx = ((BindingProvider)port).getRequestContext();
		ctx.put("ws-security.username", "moi");
		ctx.put("ws-security.password", "mypassword");
		
		System.out.println(port.getPrix("ABCD"));
	}

}
