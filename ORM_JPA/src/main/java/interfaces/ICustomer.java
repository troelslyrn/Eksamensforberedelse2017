/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import java.util.List;

/**
 *
 * @author Anders
 */
public interface ICustomer {
    public Customer createCustomer(Customer customer);
    public Customer getCustomer(int id);
    public List<Customer> getCustomers();
    public Customer deleteCustomer(int id);
}
