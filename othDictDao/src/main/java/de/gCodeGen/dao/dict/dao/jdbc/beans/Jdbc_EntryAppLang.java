
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
import de.othsoft.codeGen.requirements.jdbc.ConnectionFactory;
import de.othsoft.codeGen.requirements.DaoException;
import de.othsoft.codeGen.requirements.QueryRestr;
import de.othsoft.codeGen.requirements.QuerySort;
import de.othsoft.codeGen.requirements.UserData;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.jdbc.JdbcCmdData;
import de.othsoft.codeGen.requirements.jdbc.utils.StringConsts;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.othsoft.codeGen.requirements.jdbc.utils.IJdbcDataFactoryBase;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.addFilter2Sql;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.setValue;
import de.othsoft.codeGen.requirements.AttribType;


public class Jdbc_EntryAppLang extends de.gCodeGen.dao.dict.beans.EntryAppLang {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_EntryAppLang.class);

    public Jdbc_EntryAppLang (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.EntryAppLang byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.EntryAppLang> wrapper = new SQLExecWrapper(log);
        return wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
    }

    public static List<de.gCodeGen.dao.dict.beans.EntryAppLang> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.EntryAppLang> wrapper = new SQLExecWrapper(log);
        return wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.EntryAppLang> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    private final static Jdbc_EntryAppLang_User wrapperUser = new Jdbc_EntryAppLang_User();
}

class Jdbc_EntryAppLang_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.EntryAppLang> {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT v2.id AS v2_a0";
        sql += ",v2.app_id AS v2_a1";
        sql += ",v2.lang_shortname AS v2_a2";
        sql += ",v2.txt AS v2_a3";
        sql += " FROM dict_EntryAppLang v2"; 
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " id=?";
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
            case "v2_a1":
                sql = addFilter2Sql("v2.app_id",r,sql);
                break;
            case "v2_a2":
                sql = addFilter2Sql("v2.lang_shortname",r,sql);
                break;
            case "v2_a3":
                sql = addFilter2Sql("v2.txt",r,sql);
                break;
    
            default:
                throw new DaoException("Jdbc_EntryAppLang_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.EntryAppLang initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_EntryAppLang ret = new Jdbc_EntryAppLang(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setApp_id(rs.getString(i));
        i++;
        ret.setLang_shortname(rs.getString(i));
        i++;
        ret.setTxt(rs.getString(i));
    
        return ret;
    }
}
