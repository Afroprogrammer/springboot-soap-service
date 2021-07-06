package com.example.springbootsoapservice.service;


import com.example.springboot_soap_service.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void intialize(){
        User franklio = new User();
        franklio.setUser("franklin");
        franklio.setEmpId(112244);
        franklio.setSalary(2.00);

        User Innocent = new User();
        Innocent.setUser("Innocent");
        Innocent.setEmpId(114);
        Innocent.setSalary(2000.00);


        User Erastus = new User();
        Erastus.setUser("Erastus");
        Erastus.setEmpId(14);
        Erastus.setSalary(25446.00);



        users.put(franklio.getUser(), franklio);
        users.put(Innocent.getUser(), Innocent);
        users.put(Erastus.getUser(), Erastus);
    }

    public User getUser(String name)
    {
        return users.get(name);
    }
}
