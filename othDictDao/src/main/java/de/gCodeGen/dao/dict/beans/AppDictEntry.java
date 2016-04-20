
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;




/**
 * relation between apps and dictentrys
 */
public class AppDictEntry extends UpdatableBean<AppDictEntry> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e3";
    public final static String ID_ID="e3_a0";
    
    public final static String ID_ID_STR="e3_a1"; 
    
    public final static String ID_DESCR="e3_a2"; 
    
    public final static String ID_GROUP="e3_a3"; 
    
    
    public final static String ID_APPLICATION_ID="e3_r1";
    


    
     
    protected String id_str; 
    
     
    protected String descr; 
    
    
    protected Integer groupId;
    protected String groupIdTxt; 
    
    protected Integer applicationId;
    

    public AppDictEntry () {
        super();
    }
    
    public String getId_str() { return this.id_str; }
    public void setId_str(String v) {
        this.id_str = v;
        setChanged();
    }
    
    public String getDescr() { return this.descr; }
    public void setDescr(String v) {
        this.descr = v;
        setChanged();
    }
    
    public Integer getGroupId() { return this.groupId; }
    public void setGroupId(Integer v) {
        this.groupId = v;
        setChanged();
    }
    public String getGroupIdTxt() { return this.groupIdTxt; }
    public void setGroupIdTxt(String v) {
        this.groupIdTxt = v;
        setChanged();
    }
    
    
    public Integer getApplicationId() { return this.applicationId; }
    public void setApplicationId(Integer v) {
        this.applicationId = v;
        setChanged();
    }
    

    public AppDictEntry clone() {
        AppDictEntry newObj = new AppDictEntry();
    
        newObj.setId_str(id_str);
    
        newObj.setDescr(descr);
    
        newObj.setGroupId(groupId);
        newObj.setGroupIdTxt(groupIdTxt);
    
    
        newObj.setApplicationId(applicationId);
    
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
