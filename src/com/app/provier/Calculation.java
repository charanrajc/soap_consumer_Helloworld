
package com.app.provier;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculation", targetNamespace = "http://provier.app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculation {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doSum", targetNamespace = "http://provier.app.com/", className = "com.app.provier.DoSum")
    @ResponseWrapper(localName = "doSumResponse", targetNamespace = "http://provier.app.com/", className = "com.app.provier.DoSumResponse")
    @Action(input = "http://provier.app.com/Calculation/doSumRequest", output = "http://provier.app.com/Calculation/doSumResponse")
    public int doSum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
