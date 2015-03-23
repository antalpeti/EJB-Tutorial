/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.example.service;

import com.javacodegeeks.example.entity.Customer;
import javax.ejb.Stateless;

/**
 *
 * @author Peti
 */
@Stateless
public class AccountService implements AccountServiceRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public Customer createAccount(String firstName, String lastName) {
        return null;
    }
}
