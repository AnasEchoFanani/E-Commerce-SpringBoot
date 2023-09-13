package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.entity.Role;
import com.siteWeb.eCommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminInterface {
//______________________________________________Product______________________________________________________________
    public void Add_Product(Produit produit);
    public void Update_Product(Produit produit);
    public Produit Select_Product_By_Id(int id);
    public List<Produit> SelectAll_Product();
    public Produit Delete_Product(int id);
//_________________________________________________Category__________________________________________________________
    public void Add_Category(Category category);
    public void Update_Category(Category category);
    public Category Select_Category_By_Id(int id);
    public List<Category> SelectAll_Category();
    public Category Delete_Category(int id);
//_______________________________________________Role_________________________________________________________________
    public void Add_Role(Role role);
    public void Update_Role(Role role);
    public Role Select_Role_By_Id(int id);
    public List<Role> SelectAll_Role();
    public Role Delete_Role(int id);
//_________________________________________________edite_user________________________________________________________

    public List<User> SelectAll_User();
    public User Select_User_By_Id(int id);
    public User Update_user_role(User user);
}
