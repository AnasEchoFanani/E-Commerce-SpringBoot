package com.siteWeb.eCommerce.service;

import com.siteWeb.eCommerce.entity.Category;
import com.siteWeb.eCommerce.entity.Events;
import com.siteWeb.eCommerce.entity.Produit;
import com.siteWeb.eCommerce.model.EventInterface;
import com.siteWeb.eCommerce.model.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements EventServiceInterface{
    @Autowired
    EventInterface eventInterface;
//______________________________________________Product_____________________________________________________________
    public Events SelectOneEvent(int id){
        return eventInterface.Select_Event_By_Id(id);
    }
    public List<Events> select_All_Event(){
        return eventInterface.SelectAll_Event();
    }
    public List<Events> select_By_Title_Event(String title){
        return eventInterface.Search_By_Title_Event(title);
    }


}
