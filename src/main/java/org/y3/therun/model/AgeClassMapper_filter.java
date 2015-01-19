package org.y3.therun.model;

import org.y3.commons.model.IModelMapper_filter;

/** 
 * <p>Title: org.y3.therun.model - AgeClassMapper_filter</p>
 * <p>Description: Filter for age class mapper</p>
 * <p>Copyright: 2015</p>
 * <p>Company: SE Bordnetze GmbH</p>
 * <p>Department: CIT SC GSD</p>
 * @author Christian.Rybotycky
 * @version $Id$
*/
public class AgeClassMapper_filter implements IModelMapper_filter {
    
    private Integer id;
    private String title;
    private Integer yearFrom;
    private Integer yearTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public void setYearTo(Integer toYear) {
        this.yearTo = toYear;
    }

}
