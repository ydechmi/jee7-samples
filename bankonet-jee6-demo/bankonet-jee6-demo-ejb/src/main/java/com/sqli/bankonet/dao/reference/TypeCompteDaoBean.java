package com.sqli.bankonet.dao.reference;

import com.sqli.bankonet.dao.AbstractDao;
import com.sqli.bankonet.domaine.reference.TypeCompte;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TypeCompteDaoBean
 */
@Stateless
@LocalBean
public class TypeCompteDaoBean extends AbstractDao<TypeCompte,Integer> {
       
    /**
     * @see AbstractDao#AbstractDao()
     */
    public TypeCompteDaoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.sqli.bankonet.dao.AbstractDao#getEntityClass()
	 */
	@Override
	public Class<TypeCompte> getEntityClass() {
		// TODO Auto-generated method stub
		return TypeCompte.class;
	}
    
    

}
