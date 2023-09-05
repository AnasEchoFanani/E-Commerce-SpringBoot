package com.siteWeb.eCommerce.controller;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.service.AdminServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServiceInterface adminServiceInterface;

    @GetMapping("/all-product")
    public List<Produit> getAllProducts() {
        return adminServiceInterface.select_All_Product();
    }
    @PostMapping("/add")
    public Produit addProduct(@RequestBody Produit produit) {
        System.out.println(produit);
        System.out.println(produit.getCategory().getId());
        Category category = adminServiceInterface.selectOneCategory(produit.getCategory().getId());
        produit.setCategory(category);
        return adminServiceInterface.add_Product(produit);
    }
}
