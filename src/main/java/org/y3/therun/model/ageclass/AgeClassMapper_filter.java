package org.y3.therun.model.ageclass;

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
    //relations
    private Integer belongsToAgeclassesdefinition;

    public Integer getBelongsToAgeclassesdefinition() {
        return belongsToAgeclassesdefinition;
    }
    
    public AgeClassMapper_filter() {
    }
    
    public AgeClassMapper_filter(AgeClass_filter ageClass_filter) {
        if (ageClass_filter != null) {
            
        }
    }

    public AgeClassMapper_filter setBelongsToAgeclassesdefinition(Integer belongsToAgeclassesdefinition) {
        this.belongsToAgeclassesdefinition = belongsToAgeclassesdefinition;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AgeClassMapper_filter setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AgeClassMapper_filter setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public AgeClassMapper_filter setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
        return this;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public AgeClassMapper_filter setYearTo(Integer toYear) {
        this.yearTo = toYear;
        return this;
    }

}
