package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class EventDao implements EventInterface {
    @PersistenceContext
    EntityManager entityManager;

    //___________________________________Product__________________________________________________________________
    public Produit Select_Event_By_Id(int id) {
        Produit produit = entityManager.find(Produit.class, id);
        entityManager.close();
        return produit;
    }

    public List<Produit> SelectAll_Event() {
        Query query = entityManager.createQuery("from Produit ");
        List<Produit> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }

    public List<Produit> Search_By_Title_Event(String title) {
        Query query = entityManager.createQuery("SELECT p FROM Produit p WHERE p.nomProduit LIKE CONCAT('%', :title, '%')");
        query.setParameter("title", title);
        List<Produit> produits = query.getResultList();
        entityManager.close();
        return produits;
    }
}
