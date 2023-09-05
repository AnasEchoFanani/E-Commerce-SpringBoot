package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.entity.Role;

import java.util.List;

public interface AdminServiceInterface {

//______________________________________________Product_____________________________________________________________
    public Produit add_Product(Produit produit);
    public Produit update_One_Product(Produit produit);
    public Produit SelectOneProduct(int id);
    public List<Produit> select_All_Product();
    public Produit delete_One_Product(int id);

//____________________________________________________Category______________________________________________________
    public Category add_Category(Category category);
    public Category update_One_Category(Category category);
    public Category selectOneCategory(int id);
    public List<Category> select_All_Category();
    public Category delete_One_Category(int id);

//__________________________________________________Role___________________________________________________________
    public Role add_Role(Role role);
    public Role update_One_Role(Role role);
    public Role selectOneRole(int id);
    public List<Role> select_All_Role();
    public Role delete_One_Role(int id);
}
