
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;




/**
 * what application use this string resource
 */
public class Application extends UpdatableBean<Application> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e2";
    public final static String ID_ID="e2_a0";
    
    public final static String ID_NAME="e2_a1"; 
    
    public final static String ID_DESCR="e2_a2"; 
    
    public final static String ID_ID_STR="e2_a3"; 
    
    


    
     
    protected String name; 
    
     
    protected String descr; 
    
     
    protected String id_str; 
    
    

    public Application () {
        super();
    }
    
    public String getName() { return this.name; }
    public void setName(String v) {
        this.name = v;
        setChanged();
    }
    
    public String getDescr() { return this.descr; }
    public void setDescr(String v) {
        this.descr = v;
        setChanged();
    }
    
    public String getId_str() { return this.id_str; }
    public void setId_str(String v) {
        this.id_str = v;
        setChanged();
    }
    
    

    public Application clone() {
        Application newObj = new Application();
    
        newObj.setName(name);
    
        newObj.setDescr(descr);
    
        newObj.setId_str(id_str);
    
    
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
