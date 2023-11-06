
package webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "WSPaqueteController", targetNamespace = "http://webService/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WSPaqueteController {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/WSPaqueteController/pingRequest", output = "http://webService/WSPaqueteController/pingResponse")
    public String ping();

}