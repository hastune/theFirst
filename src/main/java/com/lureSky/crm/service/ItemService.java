package com.lureSky.crm.service;

import com.lureSky.crm.entity.Items;

import java.util.List;

public interface ItemService {
    //查询商品列表
     List<Items> selectItemsList();
}
