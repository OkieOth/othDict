package de.gCodeGen.dao.dict.dao.jdbc;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.jdbc.JdbcDataFactoryGenerator
 */

import de.gCodeGen.dao.dict.beans.*;
import de.gCodeGen.dao.dict.dao.interf.IJdbcDataFactory_dict;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.jdbc.JdbcCmdData;
import de.othsoft.codeGen.requirements.jdbc.ConnectionFactory;
import de.othsoft.codeGen.requirements.DaoException;
import de.othsoft.codeGen.requirements.QueryRestr;
import de.othsoft.codeGen.requirements.QuerySort;
import de.othsoft.codeGen.requirements.UserData;
import de.othsoft.codeGen.requirements.jdbc.utils.ISetPagingImpl;
import de.othsoft.codeGen.requirements.jdbc.utils.ISetFilterValuesImpl;
import de.othsoft.codeGen.requirements.jdbc.utils.IJdbcDataFactoryBase;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataFactory_dict implements IJdbcDataFactory_dict, IJdbcDataFactoryBase {

    @Override
    public Dictionary create_Dictionary() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Dictionary (this);
    }

    @Override
    public Dictionary byId_Dictionary(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Dictionary.byId(this,userData,cmdData,id);
    }

    @Override
    public List<Dictionary> get_Dictionary(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Dictionary.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_Dictionary(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Dictionary.count(this,userData,cmdData,restr);
    }

    @Override
    public Application create_Application() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Application (this);
    }

    @Override
    public Application byId_Application(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Application.byId(this,userData,cmdData,id);
    }

    @Override
    public List<Application> get_Application(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Application.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_Application(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Application.count(this,userData,cmdData,restr);
    }

    @Override
    public AppDictEntry create_AppDictEntry() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry (this);
    }

    @Override
    public AppDictEntry byId_AppDictEntry(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry.byId(this,userData,cmdData,id);
    }

    @Override
    public List<AppDictEntry> get_AppDictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_AppDictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry.count(this,userData,cmdData,restr);
    }

    @Override
    public Language create_Language() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Language (this);
    }

    @Override
    public Language byId_Language(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Language.byId(this,userData,cmdData,id);
    }

    @Override
    public List<Language> get_Language(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Language.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_Language(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_Language.count(this,userData,cmdData,restr);
    }

    @Override
    public DictEntry create_DictEntry() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry (this);
    }

    @Override
    public DictEntry byId_DictEntry(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry.byId(this,userData,cmdData,id);
    }

    @Override
    public List<DictEntry> get_DictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_DictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry.count(this,userData,cmdData,restr);
    }



    @Override
    public AppDictEntry_Group create_AppDictEntry_Group() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry_Group (this);
    }

    @Override
    public AppDictEntry_Group byId_AppDictEntry_Group(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry_Group.byId(this,userData,cmdData,id);
    }

    @Override
    public List<AppDictEntry_Group> get_AppDictEntry_Group(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry_Group.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_AppDictEntry_Group(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_AppDictEntry_Group.count(this,userData,cmdData,restr);
    }

    @Override
    public DictEntry_Trans_state create_DictEntry_Trans_state() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry_Trans_state (this);
    }

    @Override
    public DictEntry_Trans_state byId_DictEntry_Trans_state(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry_Trans_state.byId(this,userData,cmdData,id);
    }

    @Override
    public List<DictEntry_Trans_state> get_DictEntry_Trans_state(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry_Trans_state.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_DictEntry_Trans_state(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntry_Trans_state.count(this,userData,cmdData,restr);
    }



    @Override
    public LangsForApp create_LangsForApp() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_LangsForApp (this);
    }

    @Override
    public LangsForApp byId_LangsForApp(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_LangsForApp.byId(this,userData,cmdData,id);
    }

    @Override
    public List<LangsForApp> get_LangsForApp(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_LangsForApp.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_LangsForApp(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_LangsForApp.count(this,userData,cmdData,restr);
    }

    @Override
    public EntryAppLang create_EntryAppLang() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_EntryAppLang (this);
    }

    @Override
    public EntryAppLang byId_EntryAppLang(UserData userData,CmdData cmdData,int id) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_EntryAppLang.byId(this,userData,cmdData,id);
    }

    @Override
    public List<EntryAppLang> get_EntryAppLang(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_EntryAppLang.get(this,userData,cmdData,restr,sort,offset,count);
    }

    @Override
    public int count_EntryAppLang(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_EntryAppLang.count(this,userData,cmdData,restr);
    }



    @Override
    public DictEntryAppDictEntry create_DictEntryAppDictEntry() {
        return new de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry (this);
    }

    @Override
    public List<DictEntryAppDictEntry> get_DictEntryAppDictEntry_byDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry.byDictEntry(this,userData,cmdData,refId);
    }

    @Override
    public int count_DictEntryAppDictEntry_byDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry.countByDictEntry(this,userData,cmdData,refId);
    }

    @Override
    public List<DictEntryAppDictEntry> get_DictEntryAppDictEntry_byAppDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry.byAppDictEntry(this,userData,cmdData,refId);
    }

    @Override
    public int count_DictEntryAppDictEntry_byAppDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry.countByDictEntry(this,userData,cmdData,refId);
    }

    @Override
    public DictEntryAppDictEntry byIds_DictEntryAppDictEntry(UserData userData,CmdData cmdData,int idDictEntry,int idAppDictEntry) throws DaoException {
        return de.gCodeGen.dao.dict.dao.jdbc.beans.Jdbc_DictEntryAppDictEntry.byIds(this,userData,cmdData,idDictEntry,idAppDictEntry);
    }


    @Override
    public CmdData startTransaction() throws DaoException {
        Connection con=connectionFactory.getCon();
        return new JdbcCmdData(con);
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public void setFilterValues(PreparedStatement ps, List<QueryRestr> restr) throws SQLException, DaoException {
        setFilterValuesImpl.setFilterValues(ps,restr);
    }
    
    public ISetFilterValuesImpl getSetFilterValuesImpl() { return setFilterValuesImpl; }
    public void setSetFilterValuesImpl(ISetFilterValuesImpl setFilterValuesImpl) { this.setFilterValuesImpl = setFilterValuesImpl; }

    public void setConnectionFactory (ConnectionFactory connectionFactory) { this.connectionFactory = connectionFactory; }
    public ConnectionFactory getConnectionFactory () { return this.connectionFactory; }

    public void setSetPagingImpl(ISetPagingImpl setPagingImpl) { this.setPagingImpl = setPagingImpl; }
    public ISetPagingImpl getSetPagingImpl() { return this.setPagingImpl; }

    private ISetFilterValuesImpl setFilterValuesImpl;
    private ISetPagingImpl setPagingImpl;
    private ConnectionFactory connectionFactory;
    private static final Logger log = LoggerFactory.getLogger(DataFactory_dict.class);

}
