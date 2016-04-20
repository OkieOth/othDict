
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.IdBean;




/**
 * give the entries for app and langs
 */
public class EntryAppLang extends IdBean implements Serializable {
    static final long serialVersionUID = 1L;
    public final static String ID="v2";
    public final static String ID_ID="v2_a0";
    
    public final static String ID_APP_ID="v2_a1"; 
    
    public final static String ID_LANG_SHORTNAME="v2_a2"; 
    
    public final static String ID_TXT="v2_a3"; 
    

     
    protected String app_id; 
     
    protected String lang_shortname; 
     
    protected String txt; 
    

    public EntryAppLang () {
        super();
    }
     
    public String getApp_id() { return this.app_id; }
    public void setApp_id(String v) {
        this.app_id = v;
        setChanged();
    }
     
    public String getLang_shortname() { return this.lang_shortname; }
    public void setLang_shortname(String v) {
        this.lang_shortname = v;
        setChanged();
    }
     
    public String getTxt() { return this.txt; }
    public void setTxt(String v) {
        this.txt = v;
        setChanged();
    }
    

}
