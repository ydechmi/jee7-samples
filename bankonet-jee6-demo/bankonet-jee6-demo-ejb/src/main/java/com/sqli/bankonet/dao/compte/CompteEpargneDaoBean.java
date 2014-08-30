package com.sqli.bankonet.dao.compte;

import com.sqli.bankonet.dao.AbstractDao;
import com.sqli.bankonet.domaine.compte.CompteEpargne;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CompteEpargneDaoBean
 */
@Stateless
@LocalBean
public class CompteEpargneDaoBean extends AbstractDao<CompteEpargne,Long> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public CompteEpargneDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<CompteEpargne> getEntityClass() {
		// TODO Auto-generated method stub
		return CompteEpargne.class;
	}
    
    

}
