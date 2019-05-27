import java.net.URL;
import javax.xml.ws.WebServiceRef;
import javax.xml.namespace.QName;
import importservice.*;
public class echoClient {
static EchoWSService service;
public static void main(String[] args) {
try {
EchoWSService service = new EchoWSService();
System.out.println("Retrieving the port from the following service: "+ service);
EchoWS port = service.getEchoWSPort();
System.out.println("Invoking the echo operation on the port.");
String response = port.echo(args[0]);
System.out.println("Echo value ==> "+response);
} catch (Exception e) {
e.printStackTrace();}
}
}