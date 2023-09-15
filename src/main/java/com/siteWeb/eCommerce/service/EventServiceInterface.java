package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Events;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface EventServiceInterface {
//______________________________________________Product_____________________________________________________________
    public Events SelectOneEvent(int id);
    public List<Events> select_All_Event();
    public List<Events> select_By_Title_Event(String title);
}
