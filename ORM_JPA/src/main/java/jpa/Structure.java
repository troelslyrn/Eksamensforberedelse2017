/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author Anders
 */
public class Structure {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("ORM_JPA_PU", new HashMap());
    }
}
