package org.y3.therun.model.ageclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import org.y3.commons.database.SqLiteJdbcDatabase;
import org.y3.commons.model.IModelMapper_filter;
import org.y3.commons.model.IModel_entity;
import org.y3.commons.model.IModel_mapper;
import org.y3.commons.model.IModel_model;

/** 
 * <p>Title: org.y3.therun.model - AgeClass_mapper</p>
 * <p>Description: Mapper for age class</p>
 * <p>Copyright: 2015</p>
 * <p>Company: SE Bordnetze GmbH</p>
 * <p>Department: CIT SC GSD</p>
 * @author Christian.Rybotycky
 * @version $Id$
*/
public class AgeClass_mapper extends IModel_mapper{
    
    public final static String KEY_TABLE = "AGECLASS";
    
    public final static String KEY_ID = "ID";
    public final static String KEY_TITLE = "TITLE";
    public final static String KEY_YEAR_FROM = "YEAR_FROM";
    public final static String KEY_YEAR_TO = "YEAR_TO";
    //relation keys
    public final static String FOREIGN_KEY_BELONGSTOAGECLASSESDEFINITION = "BELONGS_TO_AGECLASSESDEFINITION";

    public AgeClass_mapper(SqLiteJdbcDatabase _database) {
        super(_database);
    }

    @Override
    public String createModelWhereClause(IModelMapper_filter filter) {
        String where = null;
        if (filter != null && filter instanceof AgeClassMapper_filter) {
            AgeClassMapper_filter acFilter = (AgeClassMapper_filter) filter;
            HashMap<String, String> filters = new HashMap<>();
            if (acFilter.getId() != null) {
                filters.put(KEY_ID, acFilter.getId().toString());
            }
            filters.put(KEY_TITLE, acFilter.getTitle());
            if (acFilter.getYearFrom() != null) {
                filters.put(KEY_YEAR_FROM, acFilter.getYearFrom().toString());
            }
            if (acFilter.getYearTo() != null) {
                filters.put(KEY_YEAR_TO, acFilter.getYearTo().toString());
            }
            if (acFilter.getBelongsToAgeclassesdefinition() != null) {
                filters.put(FOREIGN_KEY_BELONGSTOAGECLASSESDEFINITION, acFilter.getBelongsToAgeclassesdefinition().toString());
            }
            where = getDatabase().createWhereClause(filters, true);
        }
        return where;
    }

    @Override
    public String createEntityWhereClause(IModelMapper_filter filter) {
        return createModelWhereClause(filter);
    }

    @Override
    public IModel_entity mapCurrentEntity(ResultSet modelResultSet) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AgeClass_list createModelList() {
        return new AgeClass_list();
    }

    @Override
    public AgeClass_model createModel(IModelMapper_filter filter) throws SQLException {
        AgeClass_model ageClass_model = null;
        AgeClassMapper_filter acFilter;
        if (filter != null && filter instanceof AgeClassMapper_filter) {
            acFilter = (AgeClassMapper_filter) filter;
        } else {
            acFilter = new AgeClassMapper_filter();
        }
        String sql = "INSERT INTO " + getTableName() + "( "
                + KEY_TITLE + ", "
                + KEY_YEAR_FROM + ", "
                + KEY_YEAR_TO 
                + FOREIGN_KEY_BELONGSTOAGECLASSESDEFINITION + ") VALUES ("
                + "'" + acFilter.getTitle() + "', "
                + acFilter.getYearFrom() + ", "
                + acFilter.getYearTo() + ", "
                + acFilter.getBelongsToAgeclassesdefinition();
        int affectedRows = getDatabase().sqlUpdate(sql);
        if (affectedRows >= 1) {
            acFilter.setId(getLastCreatedModelId());
            ageClass_model = loadAgeClass(acFilter);
        }
        return ageClass_model;
    }
    
    public AgeClass_model loadAgeClass(AgeClassMapper_filter filter) throws SQLException {
        return (AgeClass_model) loadModel(filter);
    }

    @Override
    public String getTableName() {
        return KEY_TABLE;
    }

    @Override
    public Integer updateModel(IModel_model model) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AgeClass_model map(ResultSet dbResult) throws SQLException {
        AgeClass_model model = new AgeClass_model();
        model.setId(dbResult.getInt(KEY_ID));
        model.setTitle(dbResult.getString(KEY_TITLE));
        model.setYearFrom(dbResult.getInt(KEY_YEAR_FROM));
        model.setYearTo(dbResult.getInt(KEY_YEAR_TO));
        return model;
    }

}
