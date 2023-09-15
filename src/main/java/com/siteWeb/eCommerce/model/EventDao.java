package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Events;
import com.siteWeb.eCommerce.entity.Produit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class EventDao implements EventInterface {
    @PersistenceContext
    EntityManager entityManager;

    //___________________________________Product__________________________________________________________________
    public Events Select_Event_By_Id(int id) {
        Events produit = entityManager.find(Events.class, id);
        entityManager.close();
        return produit;
    }

    public List<Events> SelectAll_Event() {
        Query query = entityManager.createQuery("from Produit ");
        List<Events> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }

    public List<Events> Search_By_Title_Event(String title) {
        Query query = entityManager.createQuery("SELECT p FROM Events p WHERE p.eventName LIKE CONCAT('%', :title, '%')");
        query.setParameter("title", title);
        List<Events> produits = query.getResultList();
        entityManager.close();
        return produits;
    }
}
