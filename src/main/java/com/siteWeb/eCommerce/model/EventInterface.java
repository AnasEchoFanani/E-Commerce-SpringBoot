package com.siteWeb.eCommerce.model;

import com.siteWeb.eCommerce.entity.Events;
import com.siteWeb.eCommerce.entity.Produit;

import java.util.List;

public interface EventInterface {
//______________________________________________Product______________________________________________________________
    public Events Select_Event_By_Id(int id);
    public List<Events> SelectAll_Event();
    public List<Events> Search_By_Title_Event(String title);
}
