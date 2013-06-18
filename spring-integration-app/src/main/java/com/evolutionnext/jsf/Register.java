package com.evolutionnext.jsf;

import org.springframework.stereotype.Service;

import javax.faces.bean.ManagedBean;


@Service
public class Register {

    public String save(Person person) {
        System.out.format("Person %s", person.getFirstName());
        return "Success";
    }
}
