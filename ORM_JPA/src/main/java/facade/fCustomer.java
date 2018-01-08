/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import interfaces.ICustomer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Anders
 */
public class fCustomer implements ICustomer{
    
    private EntityManagerFactory emf;
    
    public fCustomer(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            return customer;
        } finally {
            em.close();
        }
    }

    @Override
    public Customer getCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            Customer customer = em.find(Customer.class, id);
            em.getTransaction().commit();
            return customer;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Customer> getCustomers() {
        EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT customer FROM Customer customer").getResultList();
        //List<Customer> customer = null;
        
        //try {
            //em.getTransaction().begin();
            //customer = em.createQuery("SELECT customer FROM Customer customer").getResultList();
        
//            em.getTransaction().commit();
//            return customer;
//        } finally {
//            em.close();
//        }
    }

    @Override
    public Customer deleteCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            Customer customer = em.find(Customer.class, id);
            if (customer != null) {
                em.remove(customer);
            }
            em.getTransaction().commit();
            return customer;
        } finally {
            em.close();
        }
    }
    
}
