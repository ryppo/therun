package org.y3.therun.model;

import org.y3.commons.model.IModel_list;

/**
 * <p>Title: org.y3.therun.model - Competition_list</p>
 * <p>Description: List of competition models</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Competition_list extends IModel_list {

    @Override
    public Competition_model getModel(int position) {
        return (Competition_model) get(position);
    }

}
