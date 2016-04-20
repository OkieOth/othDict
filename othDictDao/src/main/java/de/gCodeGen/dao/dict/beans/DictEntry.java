
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;




/**
 * a entry to translate
 */
public class DictEntry extends UpdatableBean<DictEntry> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e5";
    public final static String ID_ID="e5_a0";
    
    public final static String ID_TXT="e5_a1"; 
    
    public final static String ID_TRANS_STATE="e5_a2"; 
    
    
    public final static String ID_LANGUAGE_ID="e5_r1";
    


    
     
    protected String txt; 
    
    
    protected Integer trans_stateId;
    protected String trans_stateIdTxt; 
    
    protected Integer languageId;
    

    public DictEntry () {
        super();
    }
    
    public String getTxt() { return this.txt; }
    public void setTxt(String v) {
        this.txt = v;
        setChanged();
    }
    
    public Integer getTrans_stateId() { return this.trans_stateId; }
    public void setTrans_stateId(Integer v) {
        this.trans_stateId = v;
        setChanged();
    }
    public String getTrans_stateIdTxt() { return this.trans_stateIdTxt; }
    public void setTrans_stateIdTxt(String v) {
        this.trans_stateIdTxt = v;
        setChanged();
    }
    
    
    public Integer getLanguageId() { return this.languageId; }
    public void setLanguageId(Integer v) {
        this.languageId = v;
        setChanged();
    }
    

    public DictEntry clone() {
        DictEntry newObj = new DictEntry();
    
        newObj.setTxt(txt);
    
        newObj.setTrans_stateId(trans_stateId);
        newObj.setTrans_stateIdTxt(trans_stateIdTxt);
    
    
        newObj.setLanguageId(languageId);
    
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
