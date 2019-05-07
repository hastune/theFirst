package com.lureSky.crm.controller;

import com.lureSky.crm.entity.Items;
import com.lureSky.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/item")
@Controller
public class ItemController {
    //织入service对象
    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemList.action")
    public String itemList(Model model){
        //得到mysql
        List<Items> itemList = itemService.selectItemsList();

        model.addAttribute("itemList",itemList);

        return "itemList";


    }
}
