
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;




/**
 * language of a dict entry
 */
public class Language extends UpdatableBean<Language> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e4";
    public final static String ID_ID="e4_a0";
    
    public final static String ID_SHORTNAME="e4_a1"; 
    
    public final static String ID_DESCR="e4_a2"; 
    
    public final static String ID_DEFAULTLANG="e4_a3"; 
    
    


    
     
    protected String shortname; 
    
     
    protected String descr; 
    
     
    protected Boolean defaultlang; 
    
    

    public Language () {
        super();
    }
    
    public String getShortname() { return this.shortname; }
    public void setShortname(String v) {
        this.shortname = v;
        setChanged();
    }
    
    public String getDescr() { return this.descr; }
    public void setDescr(String v) {
        this.descr = v;
        setChanged();
    }
    
    public Boolean getDefaultlang() { return this.defaultlang; }
    public void setDefaultlang(Boolean v) {
        this.defaultlang = v;
        setChanged();
    }
    
    

    public Language clone() {
        Language newObj = new Language();
    
        newObj.setShortname(shortname);
    
        newObj.setDescr(descr);
    
        newObj.setDefaultlang(defaultlang);
    
    
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
