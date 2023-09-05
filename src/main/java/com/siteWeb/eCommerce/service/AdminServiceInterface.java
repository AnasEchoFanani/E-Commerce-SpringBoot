package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface AdminServiceInterface {
    public Produit add_Product(Produit produit);
    public void update_One_Product(Produit produit);
    public Produit SelectOneProduct(int id);
    public Category selectOneCategory(int id);
    public List<Produit> select_All_Product();
    public void delete_One_Product(int id);
}
