
/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.sql.psql.CreateDatabaseSqlGenerator
 */
CREATE TABLE IF NOT EXISTS dict_Version (
    versionsnummer int NOT NULL,
    datum   timestamp);

INSERT INTO dict_Version (versionsnummer,datum) VALUES (1,current_timestamp);

CREATE TABLE IF NOT EXISTS dict_AppDictEntry_Group (
    id SERIAL
    , bez text
    , lang text
    , aktiv boolean
    , reihenf integer
    ,CONSTRAINT pk_dict_appdictentry_group PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS dict_DictEntry_Trans_state (
    id SERIAL
    , bez text
    , lang text
    , aktiv boolean
    , reihenf integer
    ,CONSTRAINT pk_dict_dictentry_trans_state PRIMARY KEY (id));

/**
 * All saved string resources
 */
CREATE TABLE IF NOT EXISTS dict_Dictionary ( 
    id SERIAL
    ,name text 
    ,CONSTRAINT pk_dict_dictionary PRIMARY KEY (id));

/**
 * what application use this string resource
 */
CREATE TABLE IF NOT EXISTS dict_Application ( 
    id SERIAL
    ,name text 
    ,descr text 
    ,id_str text 
    ,CONSTRAINT pk_dict_application PRIMARY KEY (id));

/**
 * relation between apps and dictentrys
 */
CREATE TABLE IF NOT EXISTS dict_AppDictEntry ( 
    id SERIAL
    ,id_str text 
    ,descr text 
    ,group_id integer 
    ,application_id integer 
    ,CONSTRAINT pk_dict_appdictentry PRIMARY KEY (id));

/**
 * language of a dict entry
 */
CREATE TABLE IF NOT EXISTS dict_Language ( 
    id SERIAL
    ,shortname text 
    ,descr text 
    ,defaultlang boolean 
    ,CONSTRAINT pk_dict_language PRIMARY KEY (id));

/**
 * a entry to translate
 */
CREATE TABLE IF NOT EXISTS dict_DictEntry ( 
    id SERIAL
    ,txt text 
    ,trans_state_id integer 
    ,language_id integer 
    ,CONSTRAINT pk_dict_dictentry PRIMARY KEY (id));

/**
 * tells what DictEntry is used for a specific AppStringEntry-ID
 */
CREATE TABLE IF NOT EXISTS dict_DictEntryAppDictEntry (
    dictentry_id integer
    ,appdictentry_id integer);

/**
 * what languages are for a app available
 */
/*
 * CREATE OR REPLACE VIEW dict_LangsForApp AS 
 * SELECT
 *  id ???
 *   ,app_name ???
 *   ,lang_shortname ???
 * FROM
 *   ??
 *;

 */
/**
 * give the entries for app and langs
 */
/*
 * CREATE OR REPLACE VIEW dict_EntryAppLang AS 
 * SELECT
 *  id ???
 *   ,app_id ???
 *   ,lang_shortname ???
 *   ,txt ???
 * FROM
 *   ??
 *;

 */
   