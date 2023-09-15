package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDao implements UserInterface {
    @PersistenceContext
    EntityManager entityManager;

    //___________________________________Product__________________________________________________________________
    public Produit Select_Product_By_Id(int id) {
        Produit produit = entityManager.find(Produit.class, id);
        entityManager.close();
        return produit;
    }

    public List<Produit> getProductsByCategoryId(int categoryId) {
        TypedQuery<Produit> query = entityManager.createQuery("SELECT p FROM Produit p WHERE p.category.id = :categoryId", Produit.class);
        query.setParameter("categoryId", categoryId);
        List<Produit> products = query.getResultList();
        entityManager.close();
        return products;
    }

    public List<Produit> SelectAll_Product() {
        Query query = entityManager.createQuery("from Produit ");
        List<Produit> produitList = query.getResultList();
        entityManager.close();
        return produitList;
    }

    public List<Produit> Search_By_Title(String title) {
        Query query = entityManager.createQuery("SELECT p FROM Produit p WHERE p.nomProduit LIKE CONCAT('%', :title, '%')");
        query.setParameter("title", title);
        List<Produit> produits = query.getResultList();
        entityManager.close();
        return produits;
    }

    public List<Produit> orderByPrice() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produit> criteriaQuery = criteriaBuilder.createQuery(Produit.class);
        Root<Produit> root = criteriaQuery.from(Produit.class);
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("prix")));
        List<Produit> produits = entityManager.createQuery(criteriaQuery).getResultList();
        entityManager.close();
        return produits;
    }

    public List<Produit> orderByPriceAsc() {
        CriteriaBuilder criteriaBuilder1 = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produit> criteriaQuery1 = criteriaBuilder1.createQuery(Produit.class);
        Root<Produit> root = criteriaQuery1.from(Produit.class);
        criteriaQuery1.orderBy(criteriaBuilder1.asc(root.get("prix")));
        List<Produit> produits = entityManager.createQuery(criteriaQuery1).getResultList();
        entityManager.close();
        return produits;
    }

//_____________________________________Category____________________________________________________________________

    public Category Select_Category_By_Id(int id) {
        Category category = entityManager.find(Category.class, id);
        entityManager.close();
        return category;
    }

    public List<Category> SelectAll_Category() {
        Query query = entityManager.createQuery("from Category");
        List<Category> categoryList = query.getResultList();
        entityManager.close();
        return categoryList;
    }
}
