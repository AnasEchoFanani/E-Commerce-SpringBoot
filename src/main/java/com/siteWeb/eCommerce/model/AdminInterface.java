package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface AdminInterface {
    public void Add_Product(Produit produit);
    public void Update_Product(Produit produit);
    public Category Select_Category_By_Id(int id);
    public Produit Select_Product_By_Id(int id);
    public List<Produit> SelectAll_Product();
    public void Delete_Product(int id);
}
