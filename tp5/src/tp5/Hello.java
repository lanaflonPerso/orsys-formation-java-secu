package tp5;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Scanner;

/**
 * Created by Administrateur on 01/06/2016.
 */
@WebService
public class Hello {

    @WebMethod(operationName = "direBonjour")
    public String sayHello(String s) {
        return "Bonjour " + s;
    }

    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new Hello());
        endpoint.publish("http://localhost:1664/hello");

        System.out.println("WSDL: http://localhost:1664/hello?wsdl");
        new Scanner(System.in).next();

        endpoint.stop();
    }
}
