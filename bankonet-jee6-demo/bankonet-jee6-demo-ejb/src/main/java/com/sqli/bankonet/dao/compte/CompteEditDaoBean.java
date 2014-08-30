package com.sqli.bankonet.dao.compte;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.sqli.bankonet.dao.AbstractDao;
import com.sqli.bankonet.domaine.compte.CompteEdite;

/**
 * Session Bean implementation class CompteEditDaoBean
 */
@Stateless
@LocalBean
public class CompteEditDaoBean extends AbstractDao<CompteEdite, Long> {

    /**
     * Default constructor. 
     */
    public CompteEditDaoBean() {
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<CompteEdite> getEntityClass() {
		// TODO Auto-generated method stub
		return CompteEdite.class;
	}
    
    

}
