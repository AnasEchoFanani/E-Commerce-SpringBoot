package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.model.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements AdminServiceInterface{
    @Autowired
    AdminInterface adminInterface;


//_______________________________________________Product__________________________________________________________
    public Produit add_Product(Produit produit){
        adminInterface.Add_Product(produit);
        return produit;
    }
    public Produit update_One_Product(Produit produit){
        adminInterface.Update_Product(produit);
        return produit;
    }
    public Produit SelectOneProduct(int id){
        return adminInterface.Select_Product_By_Id(id);
    }
    public List<Produit> select_All_Product(){
        return adminInterface.SelectAll_Product();
    }
    public Produit delete_One_Product(int id){
        return adminInterface.Delete_Product(id);
    }


//___________________________________________________Category________________________________________________________
    public Category add_Category(Category category){
        adminInterface.Add_Category(category);
        return category;
    }
    public Category update_One_Category(Category category){
        adminInterface.Update_Category(category);
        return category;
    }
    public Category selectOneCategory(int id){
        return adminInterface.Select_Category_By_Id(id);
    }
    public List<Category> select_All_Category(){
        return adminInterface.SelectAll_Category();
    }
    public Category delete_One_Category(int id){
        return adminInterface.Delete_Category(id);
    }
}
