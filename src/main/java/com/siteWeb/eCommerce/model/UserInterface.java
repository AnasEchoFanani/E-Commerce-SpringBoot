package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface UserInterface {
//______________________________________________Product______________________________________________________________
    public Produit Select_Product_By_Id(int id);
    public List<Produit> SelectAll_Product();
    public List<Produit> Search_By_Title(String title);
    public List<Produit> orderByPrice();
//_________________________________________________Category__________________________________________________________
    public Category Select_Category_By_Id(int id);
    public List<Category> SelectAll_Category();
}
