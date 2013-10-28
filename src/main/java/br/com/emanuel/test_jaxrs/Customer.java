/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.emanuel.test_jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanuel
 */
@XmlRootElement
public class Customer {
    
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
