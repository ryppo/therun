package org.y3.therun.control;

import org.y3.therun.RunStore;
import org.y3.therun.TheRun;

/**
 * <p>Title: org.y3.therun.control - ModelController</p>
 * <p>Description: </p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class ModelController {
    
    private RunStore runStore;
    
    public ModelController() throws Exception {
        runStore = new RunStore(TheRun.runStoreLocation);
        runStore.connect();
    }

}
