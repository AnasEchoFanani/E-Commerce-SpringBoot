package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.model.AdminInterface;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AdminDao implements AdminInterface {
    @PersistenceContext
    EntityManager entityManager;
    public void Add_Product(Produit produit){
        entityManager.persist(produit);
        entityManager.close();
    }
    public void Update_Product(Produit produit){
        entityManager.merge(produit);
        entityManager.close();
    }
    public Produit Select_Product_By_Id(int id){
        Produit produit = entityManager.find(Produit.class,id);
        entityManager.close();
        return produit;
    }
    public Category Select_Category_By_Id(int id){
        Category category = entityManager.find(Category.class,id);
        entityManager.close();
        return category;
    }
    public List<Produit> SelectAll_Product(){
        Query query = entityManager.createQuery("from Produit ");
        List<Produit> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }
    public void Delete_Product(int id){
        Produit produit = entityManager.find(Produit.class, id);
        entityManager.remove(produit);
        entityManager.close();
    }
}