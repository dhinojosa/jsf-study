package com.evolutionnext.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

public class DistrictConverter implements Converter {

    private DistrictFactoryBean districtFactoryBean;

    public void setDistrictFactoryBean(DistrictFactoryBean districtFactoryBean) {
        this.districtFactoryBean = districtFactoryBean;
    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        Long id = Long.parseLong(s);
        for (District district : districtFactoryBean.getDistricts()) {
           if (district.getId().equals(id)) return district;
        }
        throw new ConverterException(new FacesMessage("District was not found", "District was not found"));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((District)o).getId().toString();
    }
}
