
package webservicecli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicecli package. 
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

    private final static QName _Eliminar_QNAME = new QName("http://webservicecli/", "Eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://webservicecli/", "EliminarResponse");
    private final static QName _Actualizar_QNAME = new QName("http://webservicecli/", "actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://webservicecli/", "actualizarResponse");
    private final static QName _Agregar_QNAME = new QName("http://webservicecli/", "agregar");
    private final static QName _AgregarResponse_QNAME = new QName("http://webservicecli/", "agregarResponse");
    private final static QName _Hello_QNAME = new QName("http://webservicecli/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webservicecli/", "helloResponse");
    private final static QName _Listar_QNAME = new QName("http://webservicecli/", "listar");
    private final static QName _ListarID_QNAME = new QName("http://webservicecli/", "listarID");
    private final static QName _ListarIDResponse_QNAME = new QName("http://webservicecli/", "listarIDResponse");
    private final static QName _ListarResponse_QNAME = new QName("http://webservicecli/", "listarResponse");
    private final static QName _Perimetro_QNAME = new QName("http://webservicecli/", "perimetro");
    private final static QName _PerimetroResponse_QNAME = new QName("http://webservicecli/", "perimetroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicecli
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarID }
     * 
     */
    public ListarID createListarID() {
        return new ListarID();
    }

    /**
     * Create an instance of {@link ListarIDResponse }
     * 
     */
    public ListarIDResponse createListarIDResponse() {
        return new ListarIDResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Perimetro }
     * 
     */
    public Perimetro createPerimetro() {
        return new Perimetro();
    }

    /**
     * Create an instance of {@link PerimetroResponse }
     * 
     */
    public PerimetroResponse createPerimetroResponse() {
        return new PerimetroResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "Eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "EliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "agregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarID }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "listarID")
    public JAXBElement<ListarID> createListarID(ListarID value) {
        return new JAXBElement<ListarID>(_ListarID_QNAME, ListarID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "listarIDResponse")
    public JAXBElement<ListarIDResponse> createListarIDResponse(ListarIDResponse value) {
        return new JAXBElement<ListarIDResponse>(_ListarIDResponse_QNAME, ListarIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Perimetro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Perimetro }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "perimetro")
    public JAXBElement<Perimetro> createPerimetro(Perimetro value) {
        return new JAXBElement<Perimetro>(_Perimetro_QNAME, Perimetro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerimetroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerimetroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicecli/", name = "perimetroResponse")
    public JAXBElement<PerimetroResponse> createPerimetroResponse(PerimetroResponse value) {
        return new JAXBElement<PerimetroResponse>(_PerimetroResponse_QNAME, PerimetroResponse.class, null, value);
    }

}
