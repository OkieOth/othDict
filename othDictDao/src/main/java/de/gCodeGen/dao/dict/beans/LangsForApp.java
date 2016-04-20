
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.IdBean;




/**
 * what languages are for a app available
 */
public class LangsForApp extends IdBean implements Serializable {
    static final long serialVersionUID = 1L;
    public final static String ID="v1";
    public final static String ID_ID="v1_a0";
    
    public final static String ID_APP_NAME="v1_a1"; 
    
    public final static String ID_LANG_SHORTNAME="v1_a2"; 
    

     
    protected String app_name; 
     
    protected String lang_shortname; 
    

    public LangsForApp () {
        super();
    }
     
    public String getApp_name() { return this.app_name; }
    public void setApp_name(String v) {
        this.app_name = v;
        setChanged();
    }
     
    public String getLang_shortname() { return this.lang_shortname; }
    public void setLang_shortname(String v) {
        this.lang_shortname = v;
        setChanged();
    }
    

}
