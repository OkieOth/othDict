
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

public class Jdbc_AppDictEntry extends de.gCodeGen.dao.dict.beans.AppDictEntry {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_AppDictEntry.class);
    public Jdbc_AppDictEntry (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.AppDictEntry byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.AppDictEntry ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.AppDictEntry> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.AppDictEntry> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    
    private void initGroupIdWithTxt(CmdData cmdData,UserData userData,String origValue) throws DaoException {
        if (origValue==null && groupIdTxt == null) return;
        if (origValue!=null && groupIdTxt != null && origValue.equals(groupIdTxt)) return;
        if (origValue!=null && groupIdTxt == null) {
            groupId = null; 
            return;
        }
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry_Group> wrapper = new SQLExecWrapper(log);
        List<QueryRestr> restr = new ArrayList();
        restr.add(new QueryRestr(de.gCodeGen.dao.dict.beans.AppDictEntry_Group.ID_BEZ,RestrType.EQUAL,groupIdTxt));
        List<de.gCodeGen.dao.dict.beans.AppDictEntry_Group> refList = wrapper.get(Jdbc_AppDictEntry_Group.wrapperUser,dataFactory,userData,cmdData,restr,null,0,0);
        int refListSize = refList.size();
        if (refListSize==0) {
            Jdbc_AppDictEntry_Group newElem = new Jdbc_AppDictEntry_Group(dataFactory);
            newElem.setBez(groupIdTxt);
            newElem.insert(cmdData, userData);
            groupId = newElem.getId();
        }
        else {
            groupId = refList.get(0).getId();
            if (refListSize>1) {
                log.error("Jdbc_AppDictEntry.initGroupIdWithTxt - viskey not unique: "+groupIdTxt);
            }
        }
    }
    

    
    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
    
        initGroupIdWithTxt(cmdData,userData,null);
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        if (!hasChanged()) return;
    
        initGroupIdWithTxt(cmdData,userData,origState==null ? null : origState.getGroupIdTxt());
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.AppDictEntry> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_AppDictEntry_User wrapperUser = new Jdbc_AppDictEntry_User();
}

class Jdbc_AppDictEntry_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.AppDictEntry>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.AppDictEntry>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.AppDictEntry>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT e3.id AS e3_a0";
        sql += ",e3.id_str AS e3_a1";
        sql += ",e3.descr AS e3_a2";
        sql += ",e3.group_id AS e3_a3";
        sql += ",e3_a3.bez AS e3_a3Txt";
    
        sql += ",e3.application_id AS e3_r1";
        sql += " FROM dict_AppDictEntry e3"; 
        sql += " LEFT OUTER JOIN dict_AppDictEntry_group e3_a3 ON e3_a3.id = e3.group_id";
    
    
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " e3.id=?";
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
            case "e3_a1":
                sql = addFilter2Sql("e3.id_str",r,sql);
                break;
            case "e3_a2":
                sql = addFilter2Sql("e3.descr",r,sql);
                break;
            case "e3_a3":
                sql = addFilter2Sql("e3_a3.bez",r,sql);
                break;
    
            case "e3_r1":
                sql = addFilter2Sql("e3.application_id",r,sql);
                break;
    
            default:
                throw new DaoException("Jdbc_AppDictEntry_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.AppDictEntry initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_AppDictEntry ret = new Jdbc_AppDictEntry(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setId_str(rs.getString(i));
        i++;
        ret.setDescr(rs.getString(i));
        i++;
        ret.setGroupId(rs.getInt(i));
        i++;
        ret.setGroupIdTxt(rs.getString(i));
    
        i++;
        ret.setApplicationId(rs.getInt(i));
        
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.AppDictEntry data) throws SQLException,DaoException {
        int i=0;
        i++;
        setValue(i,ps,data.getId_str(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getDescr(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getGroupId(),AttribType.t_str_list);
    
        i++;
        setValue(i,ps,data.getApplicationId(),AttribType.t_key);
    
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.AppDictEntry data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getId_str(),data.getId_str())) {
            colPart = prepareUpdColPart(colPart,"id_str=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            colPart = prepareUpdColPart(colPart,"descr=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getGroupId(),data.getGroupId())) {
            colPart = prepareUpdColPart(colPart,"group_id=?");
        }
    
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getApplicationId(),data.getApplicationId())) {
            colPart = prepareUpdColPart(colPart,"application_id=?");
        }
    

        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.AppDictEntry data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getId_str(),data.getId_str())) {
            i++;
            setValue(i,ps,data.getId_str(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getDescr(),data.getDescr())) {
            i++;
            setValue(i,ps,data.getDescr(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getGroupId(),data.getGroupId())) {
            i++;
            setValue(i,ps,data.getGroupId(),AttribType.t_str_list);
        }
    
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getApplicationId(),data.getApplicationId())) {
            i++;
            setValue(i,ps,data.getApplicationId(),AttribType.t_key);
        }
    
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private static String getInsColumnList() {
        return  "id_str," +
         "descr," +
         "group_id"
         
            + ",application_id";
    }

    private static String getInsParameterStr() {
        return "?,?,?,?";
    }

    @Override
    public Jdbc_AppDictEntry create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_AppDictEntry(dataFactory);
    }

    static {
        UPDATE_SQL_BASE="UPDATE dict_AppDictEntry SET ";
        INSERT_SQL = "INSERT INTO dict_AppDictEntry (" +
            getInsColumnList() + ") VALUES (" + getInsParameterStr() +")";
    }

    private final static String UPDATE_SQL_BASE;
    private final static String INSERT_SQL;
    private final static String DEL_SQL="DELETE FROM dict_AppDictEntry WHERE id=?";
}
