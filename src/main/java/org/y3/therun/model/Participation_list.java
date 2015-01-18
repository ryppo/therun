package org.y3.therun.model;

import org.y3.commons.model.IModel_list;

/**
 * <p>Title: org.y3.therun.model - Participation_list</p>
 * <p>Description: List of participation models</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Participation_list extends IModel_list {

    @Override
    public Participation_model getModel(int position) {
        return (Participation_model) get(position);
    }

}
