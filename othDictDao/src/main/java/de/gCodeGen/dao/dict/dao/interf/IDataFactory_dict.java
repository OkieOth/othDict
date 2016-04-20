package de.gCodeGen.dao.dict.dao.interf;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.FactoryInterfGenerator
 */

import de.gCodeGen.dao.dict.beans.*;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.DaoException;
import de.othsoft.codeGen.requirements.QueryRestr;
import de.othsoft.codeGen.requirements.QuerySort;
import de.othsoft.codeGen.requirements.UserData;

import java.util.List;

public interface IDataFactory_dict {

    Dictionary create_Dictionary();
    Dictionary byId_Dictionary(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<Dictionary> get_Dictionary(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_Dictionary(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    Application create_Application();
    Application byId_Application(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<Application> get_Application(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_Application(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    AppDictEntry create_AppDictEntry();
    AppDictEntry byId_AppDictEntry(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<AppDictEntry> get_AppDictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_AppDictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    Language create_Language();
    Language byId_Language(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<Language> get_Language(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_Language(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    DictEntry create_DictEntry();
    DictEntry byId_DictEntry(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<DictEntry> get_DictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_DictEntry(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;



    AppDictEntry_Group create_AppDictEntry_Group();
    AppDictEntry_Group byId_AppDictEntry_Group(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<AppDictEntry_Group> get_AppDictEntry_Group(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_AppDictEntry_Group(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    DictEntry_Trans_state create_DictEntry_Trans_state();
    DictEntry_Trans_state byId_DictEntry_Trans_state(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<DictEntry_Trans_state> get_DictEntry_Trans_state(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_DictEntry_Trans_state(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;



    LangsForApp create_LangsForApp();
    LangsForApp byId_LangsForApp(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<LangsForApp> get_LangsForApp(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_LangsForApp(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;

    EntryAppLang create_EntryAppLang();
    EntryAppLang byId_EntryAppLang(UserData userData,CmdData cmdData,int id) throws DaoException;
    List<EntryAppLang> get_EntryAppLang(UserData userData,CmdData cmdData,List<QueryRestr> restr,List<QuerySort> sort,int offset,int count) throws DaoException;
    int count_EntryAppLang(UserData userData,CmdData cmdData,List<QueryRestr> restr) throws DaoException;



    DictEntryAppDictEntry create_DictEntryAppDictEntry();
    List<DictEntryAppDictEntry> get_DictEntryAppDictEntry_byDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException;
    int count_DictEntryAppDictEntry_byDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException;
    List<DictEntryAppDictEntry> get_DictEntryAppDictEntry_byAppDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException;
    int count_DictEntryAppDictEntry_byAppDictEntry(UserData userData,CmdData cmdData,int refId) throws DaoException;
    DictEntryAppDictEntry byIds_DictEntryAppDictEntry(UserData userData,CmdData cmdData,int idDictEntry,int idAppDictEntry) throws DaoException;


    public int getVersion();

}
