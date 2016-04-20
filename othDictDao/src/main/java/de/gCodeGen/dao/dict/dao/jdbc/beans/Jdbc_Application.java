
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

public class Jdbc_Application extends de.gCodeGen.dao.dict.beans.Application {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_Application.class);
    public Jdbc_Application (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.Application byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.Application ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.Application> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.Application> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    

    
    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        if (!hasChanged()) return;
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Application> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_Application_User wrapperUser = new Jdbc_Application_User();
}

class Jdbc_Application_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.Application>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.Application>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.Application>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT e2.id AS e2_a0";
        sql += ",e2.name AS e2_a1";
        sql += ",e2.descr AS e2_a2";
        sql += ",e2.id_str AS e2_a3";
    
        sql += " FROM dict_Application e2"; 
    
    
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " e2.id=?";
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
            case "e2_a1":
                sql = addFilter2Sql("e2.name",r,sql);
                break;
            case "e2_a2":
                sql = addFilter2Sql("e2.descr",r,sql);
                break;
            case "e2_a3":
                sql = addFilter2Sql("e2.id_str",r,sql);
                break;
    
    
            default:
                throw new DaoException("Jdbc_Application_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.Application initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_Application ret = new Jdbc_Application(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setName(rs.getString(i));
        i++;
        ret.setDescr(rs.getString(i));
        i++;
        ret.setId_str(rs.getString(i));
    
    
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Application data) throws SQLException,DaoException {
        int i=0;
        i++;
        setValue(i,ps,data.getName(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getDescr(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getId_str(),AttribType.t_string);
    
    
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.Application data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getName(),data.getName())) {
            colPart = prepareUpdColPart(colPart,"name=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            colPart = prepareUpdColPart(colPart,"descr=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getId_str(),data.getId_str())) {
            colPart = prepareUpdColPart(colPart,"id_str=?");
        }
    
    

        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Application data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getName(),data.getName())) {
            i++;
            setValue(i,ps,data.getName(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            i++;
            setValue(i,ps,data.getDescr(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getId_str(),data.getId_str())) {
            i++;
            setValue(i,ps,data.getId_str(),AttribType.t_string);
        }
    
    
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private static String getInsColumnList() {
        return  "name," +
         "descr," +
         "id_str"
        ;
    }

    private static String getInsParameterStr() {
        return "?,?,?";
    }

    @Override
    public Jdbc_Application create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_Application(dataFactory);
    }

    static {
        UPDATE_SQL_BASE="UPDATE dict_Application SET ";
        INSERT_SQL = "INSERT INTO dict_Application (" +
            getInsColumnList() + ") VALUES (" + getInsParameterStr() +")";
    }

    private final static String UPDATE_SQL_BASE;
    private final static String INSERT_SQL;
    private final static String DEL_SQL="DELETE FROM dict_Application WHERE id=?";
}
