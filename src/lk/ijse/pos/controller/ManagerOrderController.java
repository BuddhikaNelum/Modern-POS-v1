/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.OrdersBO;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Buddhika Nelum
 */
public class ManagerOrderController {
    
    private static OrdersBO ordersBO = (OrdersBO) BOFactory.getInstance().getBO(BOFactory.BOType.OrdersBO);
    
    public static boolean saveOrder(OrdersDTO ordersDTO) throws Exception{
        return ordersBO.saveOrders(ordersDTO);
    }
    
    public static boolean updateOrder(OrdersDTO ordersDTO) throws Exception{
        return ordersBO.updateOrders(ordersDTO);
    }
    
    public static boolean deleteOrder(String id) throws Exception{
        return ordersBO.deleteOrders(id);
    }
    
    public static List<OrdersDTO> getAllOrders() throws Exception{
        return ordersBO.getAllOrders();
    }
    
    public static OrdersDTO findById(String id) throws Exception{
        return ordersBO.findByID(id);
    }
}
