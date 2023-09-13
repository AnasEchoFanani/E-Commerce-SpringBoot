package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.model.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterface{
    @Autowired
    UserInterface userInterface;
//______________________________________________Product_____________________________________________________________
    public Produit SelectOneProduct(int id){
        return userInterface.Select_Product_By_Id(id);
    }
    public List<Produit> select_All_Product(){
        return userInterface.SelectAll_Product();
    }
    public List<Produit> select_By_Title(String title){
        return userInterface.Search_By_Title(title);
    }
    public List<Produit> orderByPrice(){
        return userInterface.orderByPrice();
    }

    //___________________________________________________Category________________________________________________________
    public Category selectOneCategory(int id){
    return userInterface.Select_Category_By_Id(id);
}
    public List<Category> select_All_Category(){
        return userInterface.SelectAll_Category();
    }


}
