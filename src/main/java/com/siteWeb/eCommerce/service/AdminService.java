package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.model.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminService implements AdminServiceInterface{
    @Autowired
    AdminInterface adminInterface;
    public Produit add_Product(Produit produit){
        adminInterface.Add_Product(produit);
        return produit;
    }
    public void update_One_Product(Produit produit){
        adminInterface.Update_Product(produit);
    }
    public Category selectOneCategory(int id){
        return adminInterface.Select_Category_By_Id(id);
    }
    public Produit SelectOneProduct(int id){
        return adminInterface.Select_Product_By_Id(id);
    }
    public List<Produit> select_All_Product(){
        return adminInterface.SelectAll_Product();
    }
    public void delete_One_Product(int id){
        adminInterface.Delete_Product(id);
    }
}
