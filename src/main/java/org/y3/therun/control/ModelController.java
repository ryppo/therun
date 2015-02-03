package org.y3.therun.control;

import java.sql.SQLException;
import org.y3.therun.RunStore;
import org.y3.therun.TheRun;
import org.y3.therun.model.ageclass.AgeClassMapper_filter;
import org.y3.therun.model.ageclass.AgeClass_filter;
import org.y3.therun.model.ageclass.AgeClass_list;
import org.y3.therun.model.ageclass.AgeClass_mapper;

/**
 * <p>Title: org.y3.therun.control - ModelController</p>
 * <p>Description: </p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class ModelController {
    
    private final RunStore runStore;
    private AgeClass_mapper ageClass_mapper;
    
    public ModelController() throws Exception {
        runStore = new RunStore(TheRun.runStoreLocation);
        runStore.connect();
    }
    
    public AgeClass_mapper getAgeClass_mapper() {
        if (ageClass_mapper == null) {
            ageClass_mapper = new AgeClass_mapper(runStore);
        }
        return ageClass_mapper;
    }
    
    public AgeClass_list load(AgeClass_filter ageClass_filter) throws SQLException {
        AgeClassMapper_filter filter = new AgeClassMapper_filter(ageClass_filter);
        return getAgeClass_mapper().loadAgeClasses(filter);
    }

}
