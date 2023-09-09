package com.siteWeb.eCommerce.controller;

import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    //_____Use api : http://192.168.11.130:8015/product/all-product
    @GetMapping("/all-product")
    public List<Produit> getAllProducts() {
        return userServiceInterface.select_All_Product();
    }

}
