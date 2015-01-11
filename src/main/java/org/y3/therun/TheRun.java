package org.y3.therun;

import org.apache.log4j.Logger;
import org.y3.commons.application.IApplication;
import org.y3.therun.control.ModelController;
import org.y3.therun.view.ApplicationFrame;

/** 
 * <p>Title:  - TheRun</p>
 * <p>Description: </p>
 * <p>Copyright: 2014</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
*/
public class TheRun extends IApplication {
    
    private ApplicationFrame appFrame;
    private ModelController modelController;
    public final static String runStoreLocation = System.getProperty("user.home") + "/runstore.run";
    
    public TheRun() {
        super();
    }
    
    public static void main(String args[]) {
        TheRun app = new TheRun();
        app.run();
    }

    @Override
    public void run() {
        appFrame.setVisible(true);
    }

    @Override
    public String getUserPropertiesLocation() {
        return System.getProperty("user.home") + "/therun.config";
    }

    @Override
    public String getLoggerPropertiesLocation() {
        return "/org/y3/therun/log4j.properties";
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
        Logger.getLogger(TheRun.class).debug("prepare()");
        try {
            modelController = new ModelController();
        } catch (Exception e) {
            Logger.getLogger(TheRun.class).error(e);
        } finally {
            appFrame = new ApplicationFrame(modelController);
            appFrame.addWindowListener(getShutDownListener());
        }
    }

    @Override
    public void beforeShutDown() {
    }

}
