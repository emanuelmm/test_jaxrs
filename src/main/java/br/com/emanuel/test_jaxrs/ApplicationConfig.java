/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.emanuel.test_jaxrs;


import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author emanuel
 */
@ApplicationPath("resource")
public class ApplicationConfig  extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        // following code can be used to customize Jersey 2.0 JSON provider:
        try {
            //Class jsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            //Class jsonProvider = Class.forName("org.glassfish.jersey.moxy.json.MoxyJsonFeature");
            //Class jsonProvider = Class.forName("org.glassfish.jersey.jettison.JettisonFeature");
            //resources.add(jsonProvider);
            resources.add(br.com.emanuel.test_jaxrs.CustomerService.class);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically re-generated by NetBeans REST support to populate
     * given list with all resources defined in the project.
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.emanuel.test_jaxrs.CustomerService.class);
    }

}