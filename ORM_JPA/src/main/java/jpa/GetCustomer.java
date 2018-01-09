/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import facade.fCustomer;
import javax.persistence.Persistence;

/**
 *
 * @author Anders
 */
public class GetCustomer {
    public static void main(String[] args) {
        fCustomer fc = new fCustomer(Persistence.createEntityManagerFactory("ORM_JPA_PU"));
        
        System.out.println("Get Customer: " + fc.getCustomer(7));
    }
}
