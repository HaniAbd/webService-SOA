
package importservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the importservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTimeByZone_QNAME = new QName("http://webservice/", "getTimeByZone");
    private final static QName _Echo_QNAME = new QName("http://webservice/", "echo");
    private final static QName _GetTimeByZoneResponse_QNAME = new QName("http://webservice/", "getTimeByZoneResponse");
    private final static QName _EchoResponse_QNAME = new QName("http://webservice/", "echoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: importservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTimeByZone }
     * 
     */
    public GetTimeByZone createGetTimeByZone() {
        return new GetTimeByZone();
    }

    /**
     * Create an instance of {@link Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link GetTimeByZoneResponse }
     * 
     */
    public GetTimeByZoneResponse createGetTimeByZoneResponse() {
        return new GetTimeByZoneResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTimeByZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getTimeByZone")
    public JAXBElement<GetTimeByZone> createGetTimeByZone(GetTimeByZone value) {
        return new JAXBElement<GetTimeByZone>(_GetTimeByZone_QNAME, GetTimeByZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Echo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "echo")
    public JAXBElement<Echo> createEcho(Echo value) {
        return new JAXBElement<Echo>(_Echo_QNAME, Echo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTimeByZoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getTimeByZoneResponse")
    public JAXBElement<GetTimeByZoneResponse> createGetTimeByZoneResponse(GetTimeByZoneResponse value) {
        return new JAXBElement<GetTimeByZoneResponse>(_GetTimeByZoneResponse_QNAME, GetTimeByZoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "echoResponse")
    public JAXBElement<EchoResponse> createEchoResponse(EchoResponse value) {
        return new JAXBElement<EchoResponse>(_EchoResponse_QNAME, EchoResponse.class, null, value);
    }

}
