package org.y3.therun.model;

import org.y3.therun.model.ageclass.AgeClass_list;
import org.y3.commons.model.IModel_model;

/**
 * <p>Title: org.y3.therun.model - AgeClassesDefinition_model</p>
 * <p>Description: Age classes definition model</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class AgeClassesDefinition_model implements IModel_model {
    
    private String name;
    private AgeClass_list ageClasses;
    private Integer validForYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeClass_list getAgeClasses() {
        return ageClasses;
    }

    public void setAgeClasses(AgeClass_list ageClasses) {
        this.ageClasses = ageClasses;
    }

    public Integer getValidForYear() {
        return validForYear;
    }

    public void setValidForYear(Integer validForYear) {
        this.validForYear = validForYear;
    }

}
