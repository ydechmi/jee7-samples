package com.sqli.bankonet.dao.reference;

import com.sqli.bankonet.dao.AbstractDao;
import com.sqli.bankonet.domaine.reference.StatutCompte;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StatutCompteDaoBean
 */
@Stateless
@LocalBean
public class StatutCompteDaoBean extends AbstractDao<StatutCompte,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public StatutCompteDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<StatutCompte> getEntityClass() {
		// TODO Auto-generated method stub
		return StatutCompte.class;
	}
    
    

}
