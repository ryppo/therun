package org.y3.therun.model;

import org.y3.commons.model.IModel_list;

/**
 * <p>Title: org.y3.therun.model - AgeClassesDefinition_list</p>
 * <p>Description: List of age classes definitions</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class AgeClassesDefinition_list extends IModel_list {

    @Override
    public AgeClassesDefinition_model getModel(int position) {
        return (AgeClassesDefinition_model) get(position);
    }

}
