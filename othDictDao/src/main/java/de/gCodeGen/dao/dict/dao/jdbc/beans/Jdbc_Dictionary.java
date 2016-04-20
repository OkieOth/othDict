
package de.gCodeGen.dao.dict.dao.jdbc.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.jdbc.JdbcBeanGenerator
 */

import de.othsoft.codeGen.requirements.jdbc.utils.ISQLQueryWrapperUser;
import de.othsoft.codeGen.requirements.jdbc.utils.ISQLInsWrapperUser;
import de.othsoft.codeGen.requirements.jdbc.utils.ISQLUpdWrapperUser;
import de.othsoft.codeGen.requirements.jdbc.utils.ISQLDelWrapperUser;
import de.othsoft.codeGen.requirements.jdbc.utils.SQLExecWrapper;
import de.othsoft.codeGen.requirements.DaoException;
import de.othsoft.codeGen.requirements.QueryRestr;
import de.othsoft.codeGen.requirements.QuerySort;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.UserData;
import de.othsoft.codeGen.requirements.jdbc.utils.StringConsts;
import de.othsoft.codeGen.requirements.RestrType;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.othsoft.codeGen.requirements.jdbc.utils.IJdbcDataFactoryBase;
import de.othsoft.codeGen.requirements.AttribType;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.addFilter2Sql;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.setValue;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.prepareUpdColPart;

public class Jdbc_Dictionary extends de.gCodeGen.dao.dict.beans.Dictionary {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_Dictionary.class);
    public Jdbc_Dictionary (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.Dictionary byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.Dictionary ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.Dictionary> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.Dictionary> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    

    
    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        if (!hasChanged()) return;
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Dictionary> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_Dictionary_User wrapperUser = new Jdbc_Dictionary_User();
}

class Jdbc_Dictionary_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.Dictionary>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.Dictionary>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.Dictionary>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT e1.id AS e1_a0";
        sql += ",e1.name AS e1_a1";
    
        sql += " FROM dict_Dictionary e1"; 
    
    
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " e1.id=?";
    }
    
    @Override
    public String appendFilterToSql(String sql,List<QueryRestr> restr) throws DaoException {
        boolean bFirst=true;
        for (QueryRestr r:restr) {
            if (bFirst) {
                sql+=StringConsts.WHERE_SQL;
                bFirst=false;
            }
            else {
                sql+=StringConsts.AND_SQL;
            }
            switch(r.getId()) {
            case "e1_a1":
                sql = addFilter2Sql("e1.name",r,sql);
                break;
    
    
            default:
                throw new DaoException("Jdbc_Dictionary_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.Dictionary initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_Dictionary ret = new Jdbc_Dictionary(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setName(rs.getString(i));
    
    
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Dictionary data) throws SQLException,DaoException {
        int i=0;
        i++;
        setValue(i,ps,data.getName(),AttribType.t_string);
    
    
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.Dictionary data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getName(),data.getName())) {
            colPart = prepareUpdColPart(colPart,"name=?");
        }
    
    

        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Dictionary data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getName(),data.getName())) {
            i++;
            setValue(i,ps,data.getName(),AttribType.t_string);
        }
    
    
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private static String getInsColumnList() {
        return  "name"
        ;
    }

    private static String getInsParameterStr() {
        return "?";
    }

    @Override
    public Jdbc_Dictionary create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_Dictionary(dataFactory);
    }

    static {
        UPDATE_SQL_BASE="UPDATE dict_Dictionary SET ";
        INSERT_SQL = "INSERT INTO dict_Dictionary (" +
            getInsColumnList() + ") VALUES (" + getInsParameterStr() +")";
    }

    private final static String UPDATE_SQL_BASE;
    private final static String INSERT_SQL;
    private final static String DEL_SQL="DELETE FROM dict_Dictionary WHERE id=?";
}
