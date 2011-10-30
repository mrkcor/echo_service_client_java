
package net.without_brains.echo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.without_brains.echo package. 
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

    private final static QName _EchoRequest_QNAME = new QName("http://www.without-brains.net/echo", "EchoRequest");
    private final static QName _ReverseEchoResponse_QNAME = new QName("http://www.without-brains.net/echo", "ReverseEchoResponse");
    private final static QName _EchoResponse_QNAME = new QName("http://www.without-brains.net/echo", "EchoResponse");
    private final static QName _ReverseEchoRequest_QNAME = new QName("http://www.without-brains.net/echo", "ReverseEchoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.without_brains.echo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoMessageType }
     * 
     */
    public EchoMessageType createEchoMessageType() {
        return new EchoMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.without-brains.net/echo", name = "EchoRequest")
    public JAXBElement<EchoMessageType> createEchoRequest(EchoMessageType value) {
        return new JAXBElement<EchoMessageType>(_EchoRequest_QNAME, EchoMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.without-brains.net/echo", name = "ReverseEchoResponse")
    public JAXBElement<EchoMessageType> createReverseEchoResponse(EchoMessageType value) {
        return new JAXBElement<EchoMessageType>(_ReverseEchoResponse_QNAME, EchoMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.without-brains.net/echo", name = "EchoResponse")
    public JAXBElement<EchoMessageType> createEchoResponse(EchoMessageType value) {
        return new JAXBElement<EchoMessageType>(_EchoResponse_QNAME, EchoMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.without-brains.net/echo", name = "ReverseEchoRequest")
    public JAXBElement<EchoMessageType> createReverseEchoRequest(EchoMessageType value) {
        return new JAXBElement<EchoMessageType>(_ReverseEchoRequest_QNAME, EchoMessageType.class, null, value);
    }

}
