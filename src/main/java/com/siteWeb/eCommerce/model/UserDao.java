package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class UserDao implements UserInterface{
    @PersistenceContext
    EntityManager entityManager;
//___________________________________Product__________________________________________________________________
    public Produit Select_Product_By_Id(int id){
        Produit produit = entityManager.find(Produit.class,id);
        entityManager.close();
        return produit;
    }
    public List<Produit> SelectAll_Product(){
        Query query = entityManager.createQuery("from Produit ");
        List<Produit> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }
//_____________________________________Category____________________________________________________________________

    public Category Select_Category_By_Id(int id){
        Category category = entityManager.find(Category.class,id);
        entityManager.close();
        return category;
    }
    public List<Category> SelectAll_Category(){
        Query query = entityManager.createQuery("from Category");
        List<Category> categoryList = query.getResultList();
        entityManager.close();
        return categoryList;
    }
}
