
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

public class Jdbc_DictEntry extends de.gCodeGen.dao.dict.beans.DictEntry {
    protected IJdbcDataFactoryBase dataFactory;
    private static final Logger log = LoggerFactory.getLogger(Jdbc_DictEntry.class);
    public Jdbc_DictEntry (IJdbcDataFactoryBase dataFactory) {
        super();
        this.dataFactory = dataFactory;
    }

    public static de.gCodeGen.dao.dict.beans.DictEntry byId(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,int id) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        de.gCodeGen.dao.dict.beans.DictEntry ret = wrapper.byId(wrapperUser,dataFactory,userData,cmdData,id);
        return ret;
    }

    public static List<de.gCodeGen.dao.dict.beans.DictEntry> get(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        List<de.gCodeGen.dao.dict.beans.DictEntry> retList = wrapper.get(wrapperUser,dataFactory,userData,cmdData,restr,sort,offset,count);
        return retList;
    }

    public static int count(IJdbcDataFactoryBase dataFactory,UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        return wrapper.count(wrapperUser,dataFactory,userData,cmdData,restr);
    }

    
    private void initTrans_stateIdWithTxt(CmdData cmdData,UserData userData,String origValue) throws DaoException {
        if (origValue==null && trans_stateIdTxt == null) return;
        if (origValue!=null && trans_stateIdTxt != null && origValue.equals(trans_stateIdTxt)) return;
        if (origValue!=null && trans_stateIdTxt == null) {
            trans_stateId = null; 
            return;
        }
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> wrapper = new SQLExecWrapper(log);
        List<QueryRestr> restr = new ArrayList();
        restr.add(new QueryRestr(de.gCodeGen.dao.dict.beans.DictEntry_Trans_state.ID_BEZ,RestrType.EQUAL,trans_stateIdTxt));
        List<de.gCodeGen.dao.dict.beans.DictEntry_Trans_state> refList = wrapper.get(Jdbc_DictEntry_Trans_state.wrapperUser,dataFactory,userData,cmdData,restr,null,0,0);
        int refListSize = refList.size();
        if (refListSize==0) {
            Jdbc_DictEntry_Trans_state newElem = new Jdbc_DictEntry_Trans_state(dataFactory);
            newElem.setBez(trans_stateIdTxt);
            newElem.insert(cmdData, userData);
            trans_stateId = newElem.getId();
        }
        else {
            trans_stateId = refList.get(0).getId();
            if (refListSize>1) {
                log.error("Jdbc_DictEntry.initTrans_stateIdWithTxt - viskey not unique: "+trans_stateIdTxt);
            }
        }
    }
    

    
    @Override
    public void insert(CmdData cmdData,UserData userData) throws DaoException {
    
        initTrans_stateIdWithTxt(cmdData,userData,null);
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        this.id = wrapper.insert(wrapperUser,this,dataFactory,userData,cmdData);
    }

    @Override
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        wrapper.delete(wrapperUser,getId(),dataFactory,userData,cmdData);
    }

    @Override
    public void update(CmdData cmdData,UserData userData) throws DaoException {
        if (!hasChanged()) return;
    
        initTrans_stateIdWithTxt(cmdData,userData,origState==null ? null : origState.getTrans_stateIdTxt());
    
    
        SQLExecWrapper<de.gCodeGen.dao.dict.beans.DictEntry> wrapper = new SQLExecWrapper(log);
        wrapper.update(wrapperUser,this,dataFactory,userData,cmdData);
    }

    public final static Jdbc_DictEntry_User wrapperUser = new Jdbc_DictEntry_User();
}

class Jdbc_DictEntry_User implements ISQLQueryWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry>,
        ISQLInsWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry>,ISQLUpdWrapperUser<de.gCodeGen.dao.dict.beans.DictEntry>, ISQLDelWrapperUser {
    @Override
    public String getSelectBaseSql() {
        String sql = "SELECT e5.id AS e5_a0";
        sql += ",e5.txt AS e5_a1";
        sql += ",e5.trans_state_id AS e5_a2";
        sql += ",e5_a2.bez AS e5_a2Txt";
    
        sql += ",e5.language_id AS e5_r1";
        sql += " FROM dict_DictEntry e5"; 
        sql += " LEFT OUTER JOIN dict_DictEntry_trans_state e5_a2 ON e5_a2.id = e5.trans_state_id";
    
    
        return sql;
    }

    @Override
    public String getIdRestr() {
        return " e5.id=?";
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
            case "e5_a1":
                sql = addFilter2Sql("e5.txt",r,sql);
                break;
            case "e5_a2":
                sql = addFilter2Sql("e5_a2.bez",r,sql);
                break;
    
            case "e5_r1":
                sql = addFilter2Sql("e5.language_id",r,sql);
                break;
    
            default:
                throw new DaoException("Jdbc_DictEntry_User.appendFilterToSql - unknown filter id: "+r.getId());
            }
        }
        return sql;
    }

    @Override
    public de.gCodeGen.dao.dict.beans.DictEntry initFromResultSet(IJdbcDataFactoryBase dataFactory,ResultSet rs) throws SQLException {
        Jdbc_DictEntry ret = new Jdbc_DictEntry(dataFactory);
        int i=1;
        ret.setId(rs.getInt(i));
        i++;
        ret.setTxt(rs.getString(i));
        i++;
        ret.setTrans_stateId(rs.getInt(i));
        i++;
        ret.setTrans_stateIdTxt(rs.getString(i));
    
        i++;
        ret.setLanguageId(rs.getInt(i));
        
        return ret;
    }

    @Override
    public String getInsSql() {
        return INSERT_SQL;
    }

    @Override
    public void setInsValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.DictEntry data) throws SQLException,DaoException {
        int i=0;
        i++;
        setValue(i,ps,data.getTxt(),AttribType.t_string);
        i++;
        setValue(i,ps,data.getTrans_stateId(),AttribType.t_str_list);
    
        i++;
        setValue(i,ps,data.getLanguageId(),AttribType.t_key);
    
    }

    @Override
    public String getUpdSql(de.gCodeGen.dao.dict.beans.DictEntry data) {
        String colPart=null;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getTxt(),data.getTxt())) {
            colPart = prepareUpdColPart(colPart,"txt=?");
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getTrans_stateId(),data.getTrans_stateId())) {
            colPart = prepareUpdColPart(colPart,"trans_state_id=?");
        }
    
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getLanguageId(),data.getLanguageId())) {
            colPart = prepareUpdColPart(colPart,"language_id=?");
        }
    

        return UPDATE_SQL_BASE+colPart+StringConsts.WHERE_ID_SQL;
    }

    @Override
    public void setUpdValues(PreparedStatement ps,de.gCodeGen.dao.dict.beans.DictEntry data) throws SQLException,DaoException {
        int i=0;
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getTxt(),data.getTxt())) {
            i++;
            setValue(i,ps,data.getTxt(),AttribType.t_string);
        }
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getTrans_stateId(),data.getTrans_stateId())) {
            i++;
            setValue(i,ps,data.getTrans_stateId(),AttribType.t_str_list);
        }
    
        if (data.getOrigState()==null || SQLExecWrapper.isChanged(data.getOrigState().getLanguageId(),data.getLanguageId())) {
            i++;
            setValue(i,ps,data.getLanguageId(),AttribType.t_key);
        }
    
        i++;
        setValue(i,ps,data.getId(),AttribType.t_key);
    }

    @Override
    public String getDelSql() {
        return DEL_SQL;
    }

    private static String getInsColumnList() {
        return  "txt," +
         "trans_state_id"
         
            + ",language_id";
    }

    private static String getInsParameterStr() {
        return "?,?,?";
    }

    @Override
    public Jdbc_DictEntry create(IJdbcDataFactoryBase dataFactory) {
        return new Jdbc_DictEntry(dataFactory);
    }

    static {
        UPDATE_SQL_BASE="UPDATE dict_DictEntry SET ";
        INSERT_SQL = "INSERT INTO dict_DictEntry (" +
            getInsColumnList() + ") VALUES (" + getInsParameterStr() +")";
    }

    private final static String UPDATE_SQL_BASE;
    private final static String INSERT_SQL;
    private final static String DEL_SQL="DELETE FROM dict_DictEntry WHERE id=?";
}
