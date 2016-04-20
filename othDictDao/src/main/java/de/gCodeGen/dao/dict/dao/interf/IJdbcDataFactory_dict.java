package de.gCodeGen.dao.dict.dao.interf;

/*
 * This file is generated. If you change something in this file, the changes are gone away after the next running of the
 * generator.
 * Generator: de.othsoft.codeGen.impl.groovy.dao.FactoryInterfGenerator
 */

import de.othsoft.codeGen.requirements.CmdData;
import de.othsoft.codeGen.requirements.DaoException;
import java.util.List;

public interface IJdbcDataFactory_dict extends IDataFactory_dict {
    CmdData startTransaction() throws DaoException;
}
