package org.y3.therun;

import java.sql.SQLException;
import org.y3.commons.database.SqLiteJdbcDatabase;

/**
 * <p>Title: org.y3.therun - RunStore</p>
 * <p>Description: </p>
 * <p>Copyright: 2015</p>
 * <p>Organisation: IT-Happens.de</p>
 * @author Christian.Rybotycky
 */
public class RunStore extends SqLiteJdbcDatabase {

    public RunStore(String _databaseLocation) throws ClassNotFoundException, SQLException {
        super(_databaseLocation);
    }

}
