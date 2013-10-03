package com.evolutionnext.weldapp;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Daniel Hinojosa
 * @since 9/26/13 1:51 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
@Named
@RequestScoped
@ManagedBean
@Entity
@Table(name="jsf_user")
public class User implements Serializable {
    private String name;
    private Long id;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("User{name=%s}", getName());
    }


}
