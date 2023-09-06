package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface UserServiceInterface {
//______________________________________________Product_____________________________________________________________
    public Produit SelectOneProduct(int id);
    public List<Produit> select_All_Product();
//____________________________________________________Category______________________________________________________
    public Category selectOneCategory(int id);
    public List<Category> select_All_Category();
}
