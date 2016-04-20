
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

public class Jdbc_Language extends de.gCodeGen.dao.dict.beans.Language {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_Language.class);
    public Jdbc_Language (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.Language byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.Language ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.Language> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.Language> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    

    
    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        if (!hasChanged()) return;
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.Language> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_Language_User wrapperUser = new Jdbc_Language_User();
}

class Jdbc_Language_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.Language>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.Language>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.Language>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT e4.id AS e4_a0";
        sql += ",e4.shortname AS e4_a1";
        sql += ",e4.descr AS e4_a2";
        sql += ",e4.defaultlang AS e4_a3";
    
        sql += " FROM dict_Language e4"; 
    
    
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " e4.id=?";
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
            case "e4_a1":
                sql = addFilter2Sql("e4.shortname",r,sql);
                break;
            case "e4_a2":
                sql = addFilter2Sql("e4.descr",r,sql);
                break;
            case "e4_a3":
                sql = addFilter2Sql("e4.defaultlang",r,sql);
                break;
    
    
            default:
                throw new DaoException("Jdbc_Language_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.Language initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_Language ret = new Jdbc_Language(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setShortname(rs.getString(i));
        i++;
        ret.setDescr(rs.getString(i));
        i++;
        ret.setDefaultlang(rs.getBoolean(i));
    
    
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Language data) throws SQLException,DaoException {
        int i=0;
        i++;
        setValue(i,ps,data.getShortname(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getDescr(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getDefaultlang(),AttribType.t_boolean);
    
    
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.Language data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getShortname(),data.getShortname())) {
            colPart = prepareUpdColPart(colPart,"shortname=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            colPart = prepareUpdColPart(colPart,"descr=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDefaultlang(),data.getDefaultlang())) {
            colPart = prepareUpdColPart(colPart,"defaultlang=?");
        }
    
    

        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.Language data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getShortname(),data.getShortname())) {
            i++;
            setValue(i,ps,data.getShortname(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            i++;
            setValue(i,ps,data.getDescr(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDefaultlang(),data.getDefaultlang())) {
            i++;
            setValue(i,ps,data.getDefaultlang(),AttribType.t_boolean);
        }
    
    
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private static String getInsColumnList() {
        return  "shortname," +
         "descr," +
         "defaultlang"
        ;
    }

    private static String getInsParameterStr() {
        return "?,?,?";
    }

    @Override
    public Jdbc_Language create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_Language(dataFactory);
    }

    static {
        UPDATE_SQL_BASE="UPDATE dict_Language SET ";
        INSERT_SQL = "INSERT INTO dict_Language (" +
            getInsColumnList() + ") VALUES (" + getInsParameterStr() +")";
    }

    private final static String UPDATE_SQL_BASE;
    private final static String INSERT_SQL;
    private final static String DEL_SQL="DELETE FROM dict_Language WHERE id=?";
}
