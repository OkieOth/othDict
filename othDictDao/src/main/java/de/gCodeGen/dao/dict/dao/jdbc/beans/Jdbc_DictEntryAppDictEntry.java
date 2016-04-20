
package de.gCodeGen.dao.dict.dao.jdbc.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.jdbc.JdbcBeanGenerator
 */

import de.othsoft.codeGen.requirements.jdbc.utils.ISQLM2NWrapperUser;
import de.othsoft.codeGen.requirements.jdbc.utils.SQLExecM2NWrapper;
import de.othsoft.codeGen.requirements.jdbc.ConnectionFactory;
import de.othsoft.codeGen.requirements.DaoException;
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
import de.othsoft.codeGen.requirements.AttribType;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.setValue;


public class Jdbc_DictEntryAppDictEntry extends de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_DictEntryAppDictEntry.class);

    public Jdbc_DictEntryAppDictEntry (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static List<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> byDictEntry(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        return wrapper.byRef1(wrapperUser,dataFactory,userData,cmdData,id);
    }

    public static int countByDictEntry(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        return wrapper.countByRef1(wrapperUser,dataFactory,userData,cmdData,id);
    }
    public static List<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> byAppDictEntry(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        return wrapper.byRef2(wrapperUser,dataFactory,userData,cmdData,id);
    }

    public static int countByAppDictEntry(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        return wrapper.countByRef1(wrapperUser,dataFactory,userData,cmdData,id);
    }

    public static de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry byIds(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int idDictEntry,int idAppDictEntry) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        return wrapper.byIds(wrapperUser,dataFactory,userData,cmdData,idDictEntry,idAppDictEntry);
    }

    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecM2NWrapper<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> wrapper = new SQLExecM2NWrapper(log);
        wrapper.delete(wrapperUser,getDictentryId(),getAppdictentryId(),dataFactory,userData,cmdData);
    }    

    private final static Jdbc_DictEntryAppDictEntry_User wrapperUser = new Jdbc_DictEntryAppDictEntry_User();
}

class Jdbc_DictEntryAppDictEntry_User implements ISQLM2NWrapperUser<de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry> {
    @Override
    public String getSelectSqlRef1() {
        return SELECT_REF1_SQL;
    }

    @Override
    public String getSelectSqlRef2() {
        return SELECT_REF2_SQL;
    }

    @Override
    public String getSelectByIdsSql() {
        return SELECT_SQL;
    }
    
    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry data) throws SQLException,DaoException {
        setValue(1,ps,data.getDictentryId(),AttribType.t_key);
        setValue(2,ps,data.getAppdictentryId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DELETE_SQL;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.DictEntryAppDictEntry initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_DictEntryAppDictEntry ret = new Jdbc_DictEntryAppDictEntry(dataFactory);
        ret.setDictentryId(rs.getInt(1));
        ret.setAppdictentryId(rs.getInt(2));
        return ret;
    }

    private final static String DELETE_SQL="DELETE FROM dict_DictEntryAppDictEntry WHERE dictentry_id=? AND appdictentry_id=?";
    private final static String INSERT_SQL="INSERT INTO dict_DictEntryAppDictEntry (dictentry_id,appdictentry_id) VALUES (?,?)";
    private final static String SELECT_REF1_SQL="SELECT dictentry_id AS m1_r1, appdictentry_id AS m1_r2 FROM dict_DictEntryAppDictEntry WHERE dictentry_id=?";
    private final static String SELECT_REF2_SQL="SELECT appdictentry_id AS m1_r2, appdictentry_id AS m1_r2 FROM dict_DictEntryAppDictEntry WHERE appdictentry_id=?";
    private final static String SELECT_SQL="SELECT appdictentry_id AS m1_r2, appdictentry_id AS m1_r2 FROM dict_DictEntryAppDictEntry WHERE appdictentry_id=? AND dictentry_id=?";
}
