package com.siteWeb.eCommerce.controller;

import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    //_____Use api : http://192.168.11.?:8015/product/all-product
    @GetMapping("/all-product")
    public List<Produit> getAllProducts() {
        return userServiceInterface.select_All_Product();
    }

    @GetMapping("select-by-id")
    public Produit getProductById(@RequestParam int id){
        return userServiceInterface.SelectOneProduct(id);
    }
    //_____Use api : http://192.168.11.?:8015/product/search-by-title"
    @GetMapping("/search-by-title")
    public List<Produit> getProduitByTitle(@RequestParam String title){
        List<Produit> produit = userServiceInterface.select_By_Title(title);
        return produit;
    }

    //_____Use api : http://192.168.11.?:8015/product/all-product-by-price-desc"
    @GetMapping("/all-product-by-price-desc")
    public List<Produit> getAllProductByPrice(){
        return userServiceInterface.orderByPrice();
    }

    //_____Use api : http://192.168.11.?:8015/product/all-product-by-price-asc"
    @GetMapping("/all-product-by-price-asc")
    public List<Produit> getAllProductByPriceAsc(){
        return userServiceInterface.orderByPriceAsc();
    }

    //_____Use api : http://192.168.11.?:8015/product/show-product-detail?id=?"
    @GetMapping("/show-product-detail")
    public Produit getOneProduct(@RequestParam int id){
        return userServiceInterface.SelectOneProduct(id);
    }

}
