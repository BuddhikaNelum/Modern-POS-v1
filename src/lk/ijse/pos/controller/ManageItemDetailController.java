/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.ItemdetailBO;
import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.dto.ItemdetailDTO;

/**
 *
 * @author Buddhika Nelum
 */
public class ManageItemDetailController {

    private static ItemdetailBO itemdetailBO = (ItemdetailBO) BOFactory.getInstance().getBO(BOFactory.BOType.ItemdetailBO);

    public static boolean saveItemDetail(ItemdetailDTO itemdetailDTO) throws Exception {
        return itemdetailBO.saveItemdetail(itemdetailDTO);
    }

    public static boolean updateItemDetail(ItemdetailDTO itemdetailDTO) throws Exception {
        return itemdetailBO.updateItemdetail(itemdetailDTO);
    }

    public static List<ItemdetailDTO> getAllItems() throws Exception {
        return itemdetailBO.getAllItemdetail();
    }

    public static boolean deleteItemDetail(String orderId, String itemCode) throws Exception {
        return itemdetailBO.deleteItemdetail(orderId, itemCode);
    }

    public static ItemdetailDTO findById(String orderId, String itemCode) throws Exception {
        return itemdetailBO.findByID(orderId, itemCode);
    }

}
