package com.evolutionnext.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Hinojosa
 * @since 6/18/13 6:31 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
@ManagedBean
@ViewScoped
public class ListBean {

    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Dan", "Hinojosa"));
        persons.add(new Person("Ben", "Franklin"));
        persons.add(new Person("Rocky", "Bullwinkle"));
        return persons;
    }
}
