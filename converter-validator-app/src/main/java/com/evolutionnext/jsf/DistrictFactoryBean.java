package com.evolutionnext.jsf;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class DistrictFactoryBean {

    public List<District> getDistricts() {
        List<District> districts = new ArrayList<>();
        districts.add(new District(1L, "BN-123", "Beaufort-123"));
        districts.add(new District(2L, "PO-544", "Post Ontario-544"));
        return districts;
    }
}
