/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entity.Customer;
import facade.fCustomer;
import javax.persistence.Persistence;

/**
 *
 * @author Anders
 */
public class CreateCustomer {
    public static void main(String[] args) {
        fCustomer fc = new fCustomer(Persistence.createEntityManagerFactory("ORM_JPA_PU"));
        
        System.out.println("Create Customer: " + fc.createCustomer(new Customer("Hans", "hans@gmail.com")));
        System.out.println("Create Customer: " + fc.createCustomer(new Customer("Sten", "Sten@gmail.com")));
        System.out.println("Create Customer: " + fc.createCustomer(new Customer("Stoffer", "Stoffer@gmail.com")));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Get Customer: " + fc.getCustomer(1));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Get Customers: " + fc.getCustomers());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Get Customer: " + fc.getCustomer(2));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Delete Customer: " + fc.deleteCustomer(1));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Get Customers: " + fc.getCustomers());
    }
}
