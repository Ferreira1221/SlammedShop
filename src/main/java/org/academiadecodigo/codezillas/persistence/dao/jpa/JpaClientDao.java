package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.ClientDao;
import org.academiadecodigo.codezillas.persistence.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaClientDao extends GenericJpaDao<Client> implements ClientDao {

    public JpaClientDao() {
        super(Client.class);
    }

    public List<Integer> getClientIds() {
        return em.createQuery("select id from Client", Integer.class)
                .getResultList();
    }

}
