/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.ArrayList;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.PlaceOrderBO;
import lk.ijse.pos.dto.ItemdetailDTO;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Buddhika Nelum
 */
public class ManagePlaceOrderController {
    
    private static PlaceOrderBO placeOrderBO = (PlaceOrderBO) BOFactory.getInstance().getBO(BOFactory.BOType.PlaceOrder);
    
    public static boolean placeOrder(OrdersDTO ordersDTO, ArrayList<ItemdetailDTO> itemdetailDTOs) throws Exception{
        return placeOrderBO.placeOrder(ordersDTO, itemdetailDTOs);
    }
    
}
