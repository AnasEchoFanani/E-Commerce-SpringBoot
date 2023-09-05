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
public class AdminDao implements AdminInterface {
    @PersistenceContext
    EntityManager entityManager;

//__________________________________________________Product__________________________________________________________
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
    public List<Produit> SelectAll_Product(){
        Query query = entityManager.createQuery("from Produit ");
        List<Produit> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }
    public Produit Delete_Product(int id){
        Produit produit = entityManager.find(Produit.class, id);
        entityManager.remove(produit);
        entityManager.close();
        return produit;
    }


//__________________________________________________Category_________________________________________________________
    public void Add_Category(Category category){
        entityManager.persist(category);
        entityManager.close();
    }
    public void Update_Category(Category category){
        entityManager.merge(category);
        entityManager.close();
    }
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
    public Category Delete_Category(int id){
        Category category = entityManager.find(Category.class, id);
        entityManager.remove(category);
        entityManager.close();
        return category;
    }
}