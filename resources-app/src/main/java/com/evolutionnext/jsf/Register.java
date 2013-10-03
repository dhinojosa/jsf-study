package com.evolutionnext.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Register {

    private DataSource ds;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing Register");
    }

    public String save(Person person) {
        ds.persist(person);
        System.out.format("Person %s", person.getFirstName());
        return "Success";
    }
}
