package org.y3.therun.model;

import org.y3.commons.model.IModel_list;

/**
 * <p>Title: org.y3.therun.model - Contact_list</p>
 * <p>Description: List of contact models</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class Contact_list extends IModel_list {

    @Override
    public Contact_model getModel(int position) {
        return (Contact_model) get(position);
    }

}
