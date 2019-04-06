/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.CustomerBO;
import lk.ijse.pos.dto.CustomerDTO;

/**
 *
 * @author Buddhika Nelum
 */
public class ManageCustomerController {
    
    private static CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOType.CustomerBO);
    
    public static boolean saveCustomer(CustomerDTO customerDTO) throws Exception{
        return customerBO.saveCustomer(customerDTO);
    }
    
    public static List<CustomerDTO> getAllCustomers() throws Exception{
        return customerBO.getAllCustomer();
    }
    
    public static boolean updateCustomer(CustomerDTO customerDTO) throws Exception{
        return customerBO.updateCustomer(customerDTO);
    }
    
    public static boolean deleteCustomer(String id) throws Exception{
        return customerBO.deleteCustomer(id);
    }
    
    public static CustomerDTO findById(String id) throws Exception{
        return customerBO.findByID(id);
    }
}
