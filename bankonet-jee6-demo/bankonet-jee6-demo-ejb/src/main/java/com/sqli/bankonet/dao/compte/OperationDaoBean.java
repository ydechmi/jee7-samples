package com.sqli.bankonet.dao.compte;

import com.sqli.bankonet.dao.AbstractDao;
import com.sqli.bankonet.domaine.compte.Operation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class OperationDaoBean
 */
@Stateless
@LocalBean
public class OperationDaoBean extends AbstractDao<Operation,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public OperationDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<Operation> getEntityClass() {
		// TODO Auto-generated method stub
		return Operation.class;
	}
    
    

}
