package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.AccountDao;

public class JpaAccountDao extends GenericJpaDao<Account> implements AccountDao {

    public JpaAccountDao() {
        super(Account.class);
    }
}
