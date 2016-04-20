
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;




/**
 * All saved string resources
 */
public class Dictionary extends UpdatableBean<Dictionary> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e1";
    public final static String ID_ID="e1_a0";
    
    public final static String ID_NAME="e1_a1"; 
    
    


    
     
    protected String name; 
    
    

    public Dictionary () {
        super();
    }
    
    public String getName() { return this.name; }
    public void setName(String v) {
        this.name = v;
        setChanged();
    }
    
    

    public Dictionary clone() {
        Dictionary newObj = new Dictionary();
    
        newObj.setName(name);
    
    
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
