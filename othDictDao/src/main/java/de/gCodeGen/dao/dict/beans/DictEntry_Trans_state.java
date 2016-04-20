
package de.gCodeGen.dao.dict.beans;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.BeanGenerator
 */

import java.io.Serializable;
import de.othsoft.codeGen.requirements.beans.UpdatableBean;


public class DictEntry_Trans_state extends UpdatableBean<DictEntry_Trans_state> implements Serializable {
    static final long serialVersionUID = 1L;

    public final static String ID="e5_a2";
    public final static String ID_ID="e5_a2_a0";
    public final static String ID_BEZ="e5_a2_a1";
    public final static String ID_LANG="e5_a2_a2";
    public final static String ID_AKTIV="e5_a2_a3";
    public final static String ID_REIHENF="e5_a2_a4";

    /** Bezeichnung */
    protected String bez;

    /** Langbezeichnung */
    protected String lang;

    /** der Listeneintrag kann noch aktiv verwendet werden */
    protected Boolean aktiv;

    /** Reihenfolge in der die Elemente angezeigt werden sollen */
    protected Integer reihenf;

    public DictEntry_Trans_state() {
        super();
    }

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
        setChanged();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
        setChanged();
    }

    public Boolean getAktiv() {
        return aktiv;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
        setChanged();
    }

    public Integer getReihenf() {
        return reihenf;
    }

    public void setReihenf(Integer reihenf) {
        this.reihenf = reihenf;
        setChanged();
    }

    public DictEntry_Trans_state clone() {
        DictEntry_Trans_state newObj = new DictEntry_Trans_state();
        newObj.setBez(bez);
        newObj.setLang(lang);
        newObj.setAktiv(aktiv);
        newObj.setReihenf(reihenf);
        newObj.resetChangedWithoutSaveOriginalState();
        return newObj;
    }
}
