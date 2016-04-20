
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.DaoException;
import de.othsoft.codeGen.requirements.UserData;
import de.othsoft.codeGen.requirements.beans.BeanBase;


/**
 * tells what DictEntry is used for a specific AppStringEntry-ID
 */
public class DictEntryAppDictEntry extends BeanBase implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="m1";
    public final static String ID_DICTENTRY_ID="m1_r1"; 
    public final static String ID_APPDICTENTRY_ID="m1_r1"; 


    
    protected Integer dictentryId;
    
    protected Integer appdictentryId;
    
    public DictEntryAppDictEntry() {
        super();
    }

    public Integer getDictentryId() {
        return this.dictentryId;
    }

    public void setDictentryId(Integer refId) {
        this.dictentryId = refId;
        setChanged();
    }

    public Integer getAppdictentryId() {
        return this.appdictentryId;
    }

    public void setAppdictentryId(Integer refId) {
        this.appdictentryId = refId;
        setChanged();
    }

    public void insert(CmdData cmdData,UserData userData) throws DaoException {
        // Dummy-Implementierung - wird in abgeleiteten Klassen überschrieben
    }
    public void delete(CmdData cmdData,UserData userData) throws DaoException {
        // Dummy-Implementierung - wird in abgeleiteten Klassen überschrieben
    }
}
