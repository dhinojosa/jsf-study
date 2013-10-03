package com.evolutionnext.weldapp;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel Hinojosa
 * @since 9/26/13 1:52 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
@Named
@RequestScoped
public class UserBean implements Serializable {
    private User user;

    @PersistenceContext(unitName = "userPU")
    private EntityManager entityManager;

    @Resource
    private UserTransaction tx;

    @Inject
    public void setUser(User user) {
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        return (List<User>) entityManager.createQuery("select u from User as u").getResultList();
    }

    public String persist() {
        try {
            System.out.println("Persisting" + user);
            tx.begin();
            entityManager.persist(new User(user.getName()));
            tx.commit();
        } catch (Exception e) {
            try {
                System.out.println("rollback");
                e.printStackTrace();
                tx.rollback();
                return "Failure";
            } catch (SystemException e1) {
                e1.printStackTrace();
            }
        }
        return "Success";
    }
}
