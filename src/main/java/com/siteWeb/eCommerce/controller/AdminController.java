package com.siteWeb.eCommerce.controller;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.entity.Role;
import com.siteWeb.eCommerce.service.AdminServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
    @Autowired
    AdminServiceInterface adminServiceInterface;

//______________________________________________Product______________________________________________________________


    //_____Use api : http://192.168.11.130:8015/admin/all-product
    @GetMapping("/all-product")
    public List<Produit> getAllProducts() {
        return adminServiceInterface.select_All_Product();
    }

    //_____Use api : http://192.168.11.130:8015/admin/add-product
    @PostMapping("/add-product")
    public Produit addProduct(@RequestBody Produit produit) {
        Category category = adminServiceInterface.selectOneCategory(produit.getCategory().getId());
        System.out.println(category);
        produit.setCategory(category);
        produit.setCreatedAt(new Date());
        System.out.println(produit);
        return adminServiceInterface.add_Product(produit);
    }

    //_____Use api : http://192.168.11.130:8015/admin/update-product
    @PutMapping("/update-product")
    public Produit updateProduct(@RequestBody Produit produit){
        Category category = adminServiceInterface.selectOneCategory(produit.getCategory().getId());
        produit.setCategory(category);
        produit.setModifiedAt(new Date());
        return adminServiceInterface.update_One_Product(produit);
    }

    //_____Use api : http://192.168.11.130:8015/admin/delete-product
    @DeleteMapping("/delete-product")
    public Produit deleteProduct(@RequestParam int id){
        return adminServiceInterface.delete_One_Product(id);
    }



//____________________________________Category_____________________________________________________________________

    //_____Use api : http://192.168.11.130:8015/admin/all-category
    @GetMapping("/all-category")
    public List<Category> getAllCategory() {
        return adminServiceInterface.select_All_Category();
    }

    //_____Use api : http://192.168.11.130:8015/admin/add-category
    @PostMapping("/add-category")
    public Category addCategory(@RequestBody Category category) {
        category.setCreatedAt(new Date());
        return adminServiceInterface.add_Category(category);
    }

    //_____Use api : http://192.168.11.130:8015/admin/update-category
    @PatchMapping ("/update-category")
    public Category updateCategory(@RequestBody Category category){
        category.setModifiedAt(new Date());
        return adminServiceInterface.update_One_Category(category);
    }

    //_____Use api : http://192.168.11.130:8015/admin/delete-category
    @DeleteMapping("/delete-category")
    public Category deleteCategory(@RequestParam int id){
        return adminServiceInterface.delete_One_Category(id);
    }


//___________________________________________________Roles___________________________________________________________

    //_____Use api : http://192.168.11.130:8015/admin/all-role
    @GetMapping("/all-role")
    public List<Role> getAllRole() {
        return adminServiceInterface.select_All_Role();
    }

    //_____Use api : http://192.168.11.130:8015/admin/add-role
    @PostMapping("/add-role")
    public Role addRole(@RequestBody Role role) {
        role.setCreatedAt(new Date());
        return adminServiceInterface.add_Role(role);
    }

    //_____Use api : http://192.168.11.130:8015/admin/update-role
    @PutMapping("/update-role")
    public Role updateRole(@RequestBody Role role){
        role.setModifiedAt(new Date());
        return adminServiceInterface.update_One_Role(role);
    }

    //_____Use api : http://192.168.11.130:8015/admin/delete-role
    @DeleteMapping("/delete-role")
    public Role deleteRole(@RequestParam int id){
        return adminServiceInterface.delete_One_Role(id);
    }



}