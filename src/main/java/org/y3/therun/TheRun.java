package org.y3.therun;

import org.y3.commons.application.IApplication;

/** 
 * <p>Title:  - TheRun</p>
 * <p>Description: </p>
 * <p>Copyright: 2014</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
*/
public class TheRun extends IApplication {

    @Override
    public void run() {
    }

    @Override
    public String getUserPropertiesLocation() {
        return System.getProperty("user.home") + "/therun.config";
    }

    @Override
    public String getLoggerPropertiesLocation() {
        return "/org/y3/therun/log4jproperties";
    }

    @Override
    public String getResourceBundleLocation() {
        return "org/y3/therun/therun";
    }

    @Override
    public String getApplicationName() {
        return "The.Run";
    }

    @Override
    public void prepare() {
    }

    @Override
    public void beforeShutDown() {
        
    }

}
