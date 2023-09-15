package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface EventInterface {
//______________________________________________Product______________________________________________________________
    public Produit Select_Event_By_Id(int id);
    public List<Produit> SelectAll_Event();
}
