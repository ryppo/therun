package org.y3.therun.model;

import org.y3.commons.model.IModel_model;

/**
 * <p>Title: org.y3.therun.model - AgeClass_model</p>
 * <p>Description: Age class model</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class AgeClass_model implements IModel_model {
    
    private String title;
    private Integer yearFrom;
    private Integer yearTo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

}
