package org.y3.therun.model;

import org.y3.commons.model.IModel_list;

/**
 * <p>Title: org.y3.therun.model - AgeClass_list</p>
 * <p>Description: List of age classes</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class AgeClass_list extends IModel_list{

    @Override
    public AgeClass_model getModel(int position) {
        return (AgeClass_model) get(position);
    }

}
