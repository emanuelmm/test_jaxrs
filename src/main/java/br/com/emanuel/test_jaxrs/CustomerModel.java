/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.emanuel.test_jaxrs;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanuel
 */
@XmlRootElement
public class CustomerModel {
    
    List < Customer> cliente;

    public List<Customer> getCliente() {
        return cliente;
    }

    public void setCliente(List<Customer> cliente) {
        this.cliente = cliente;
    }
    
    
    
}
