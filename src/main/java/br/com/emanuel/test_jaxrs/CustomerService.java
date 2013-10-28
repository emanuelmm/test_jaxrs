/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.emanuel.test_jaxrs;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author emanuel
 */
@Path("customer")
public class CustomerService {
    @GET
    @Path("get_all")
    @Produces(MediaType.APPLICATION_JSON)
    public List < Customer > getCustomers() {
        List < Customer>  customers = new ArrayList<>();        
        for (int i=1;i<10;i++){
            Customer customer = new Customer();
            customer.setCodigo(i);
            customer.setNome("cliente"+i);
            customers.add(customer);    
        }
        return customers;
    }
    
    @GET
    @Path("get_all_obj")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerModel getCustomersObj() {
        List < Customer>  customers = new ArrayList<>();        
        for (int i=1;i<10;i++){
            Customer customer = new Customer();
            customer.setCodigo(i);
            customer.setNome("cliente"+i);
            customers.add(customer);    
        }
        
        CustomerModel c = new CustomerModel();
        c.setCliente(customers);
        
        return c;
    }
}
