package com.evolutionnext.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Daniel Hinojosa
 * @since 10/1/13 3:38 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */

@ManagedBean
@RequestScoped
public class DataSource {
    public void persist(Person person) {
        System.out.format("Persisting %s", person);
    }
}
