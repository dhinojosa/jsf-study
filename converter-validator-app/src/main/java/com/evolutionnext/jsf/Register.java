package com.evolutionnext.jsf;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Register {

    public String save(Person person) {
        System.out.format("Person %s registered from district: %s", person.getFirstName(), person.getDistrict());
        return "Success";
    }
}
