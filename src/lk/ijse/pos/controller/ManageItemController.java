/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.ItemBO;
import lk.ijse.pos.dto.ItemDTO;

/**
 *
 * @author Buddhika Nelum
 */
public class ManageItemController {
    
    private static ItemBO itemBO = (ItemBO) BOFactory.getInstance().getBO(BOFactory.BOType.ItemBO);
    
    public static boolean saveItem(ItemDTO itemDTO) throws Exception{
        return itemBO.saveItem(itemDTO);
    }
    
    public static boolean updateItem(ItemDTO itemDTO) throws Exception{
        return itemBO.updateItem(itemDTO);
    }
    
    public static List<ItemDTO> getAllItems() throws Exception{
     return itemBO.getAllItem();
    }
    
    public static boolean deleteItem(String id) throws Exception{
        return itemBO.deleteItem(id);
    }
    
    public static ItemDTO findById(String id) throws Exception{
        return itemBO.findByID(id);
    }
}
