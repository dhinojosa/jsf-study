package com.evolutionnext.jsf;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class Register {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String save(Person person) {
        System.out.format("Person %s", person.getFirstName());
        entityManager.persist(person);
        return "Success";
    }

    @Transactional
    public List<Person> getList() {
        Query query = entityManager.createQuery("SELECT p from Person as p");
        return (List<Person>) query.getResultList();
    }

    @Transactional
    public Person load(Long id) {
        return entityManager.find(Person.class, id);
    }
}
