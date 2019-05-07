package com.lureSky.crm.service.impl;

import com.lureSky.crm.dao.ItemsMapper;
import com.lureSky.crm.entity.Items;
import com.lureSky.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    /**
     * 织入一个dao
     * @return
     */
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> selectItemsList() {


        return this.itemsMapper.selectItemList();
    }
}
