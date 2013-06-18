package com.evolutionnext.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "socialSecurityValidator")
public class SocialSecurityValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if (!(o instanceof String))
            throw new ValidatorException(new FacesMessage("Unexpected type for SocialSecurityNumber; expected String"));
        String socialSecurityNumber = (String) o;
        if (socialSecurityNumber.equals("000-00-0000"))
            throw new ValidatorException(new FacesMessage("All zeros is an invalid social security number"));
    }
}
