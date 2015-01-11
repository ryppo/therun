package org.y3.therun.view;

import javax.swing.JFrame;
import org.y3.therun.control.ModelController;

/**
 * <p>Title: org.y3.therun.view - ApplicationFrame</p>
 * <p>Description: Application main frame</p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class ApplicationFrame extends JFrame {
    
    private ModelController modelController;
    
    public ApplicationFrame(ModelController _modelController) {
        modelController = _modelController;
    }

}
