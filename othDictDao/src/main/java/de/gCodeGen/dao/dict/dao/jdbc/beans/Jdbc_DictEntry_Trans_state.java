
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
import de.othsoft.codeGen.requirements.UserData;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.jdbc.utils.StringConsts;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.othsoft.codeGen.requirements.jdbc.utils.IJdbcDataFactoryBase;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.addFilter2Sql;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.setValue;
import static de.othsoft.codeGen.requirements.jdbc.utils.SQLWrapperBase.prepareUpdColPart;
import de.othsoft.codeGen.requirements.AttribType;



public class Jdbc_DictEntry_Trans_state extends de.gCodeGen.dao.dict.beans.DictEntry_Trans_state {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_DictEntry_Trans_state.class);

    public Jdbc_DictEntry_Trans_state (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.DictEntry_Trans_state byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.DictEntry_Trans_state ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_DictEntry_Trans_state_User wrapperUser = new Jdbc_DictEntry_Trans_state_User();
}

class Jdbc_DictEntry_Trans_state_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        return QUERY_SQL;
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
            case de.gCodeGen.dao.dict.beans.DictEntry_Trans_state.ID_BEZ:
                sql = addFilter2Sql("bez",r,sql);
                break;
            case de.gCodeGen.dao.dict.beans.DictEntry_Trans_state.ID_LANG:
                sql = addFilter2Sql("lang",r,sql);
                break;
            case de.gCodeGen.dao.dict.beans.DictEntry_Trans_state.ID_AKTIV:
                sql = addFilter2Sql("aktiv",r,sql);
                break;
            case de.gCodeGen.dao.dict.beans.DictEntry_Trans_state.ID_REIHENF:
                sql = addFilter2Sql("reihenf",r,sql);
                break;
            default:
                throw new DaoException("Jdbc_DictEntry_Trans_state_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " id=?";
    }

    @Override
    public de.gCodeGen.dao.dict.beans.DictEntry_Trans_state initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_DictEntry_Trans_state ret = new Jdbc_DictEntry_Trans_state(dataFactory);
        ret.setId(rs.getInt(1));
        ret.setBez(rs.getString(2));
        ret.setLang(rs.getString(3));
        ret.setAktiv(rs.getBoolean(4));
        ret.setReihenf(rs.getInt(5));
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.DictEntry_Trans_state data) throws SQLException,DaoException {
        setValue(1,ps,data.getBez(),AttribType.t_string);
        setValue(2,ps,data.getLang(),AttribType.t_string);
        setValue(3,ps,data.getAktiv(),AttribType.t_boolean);
        setValue(4,ps,data.getReihenf(),AttribType.t_int);
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.DictEntry_Trans_state data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getBez(),data.getBez())) {
            colPart = prepareUpdColPart(colPart,"bez=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getLang(),data.getLang())) {
            colPart = prepareUpdColPart(colPart,"lang=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getAktiv(),data.getAktiv())) {
            colPart = prepareUpdColPart(colPart,"aktiv=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getReihenf(),data.getReihenf())) {
            colPart = prepareUpdColPart(colPart,"reihenf=?");
        }
        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.DictEntry_Trans_state data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getBez(),data.getBez())) {
            i++;
            setValue(i,ps,data.getBez(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getLang(),data.getLang())) {
            i++;
            setValue(i,ps,data.getLang(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getAktiv(),data.getAktiv())) {
            i++;
            setValue(i,ps,data.getAktiv(),AttribType.t_boolean);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getReihenf(),data.getReihenf())) {
            i++;
            setValue(i,ps,data.getReihenf(),AttribType.t_int);
        }
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public Jdbc_DictEntry_Trans_state create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_DictEntry_Trans_state(dataFactory);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private final static String UPDATE_SQL_BASE="UPDATE dict_DictEntry_Trans_state SET ";
    private final static String INSERT_SQL = "INSERT INTO dict_DictEntry_Trans_state (bez, lang, aktiv, reihenf) VALUES (?,?,?,?)";
    private final static String QUERY_SQL = "SELECT id, bez, lang, aktiv, reihenf FROM dict_DictEntry_Trans_state";
    private final static String DEL_SQL = "DELETE FROM dict_DictEntry_Trans_state WHERE id=?";
}
