package org.pavlov.jsftemp.service;

import javax.ejb.Stateless;

/**
 * Created by Vasiliy on 30.03.2015.
 */
@Stateless
public class UserService implements UserServiceI{
    @Override
    public String getName() {
        return "Wasiliy from EJB!!!";
    }
}
