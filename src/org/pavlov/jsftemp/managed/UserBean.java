package org.pavlov.jsftemp.managed;

import org.pavlov.jsftemp.service.UserServiceI;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by Vasiliy on 30.03.2015.
 */
@Named
@RequestScoped
public class UserBean {

    @EJB
    private UserServiceI userServiceI;

    @PostConstruct
    private void init(){
        userName = userServiceI.getName();
    }

    private String userName;

    public String getUserName(){

        return  userName;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
