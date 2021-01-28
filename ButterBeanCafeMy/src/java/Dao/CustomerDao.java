/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.CustomerBean;
import Model.Menu;
import java.util.List;

/**
 *
 * @author ahmad
 */
public interface CustomerDao {
    List<CustomerBean> getCustomerAll();   
    CustomerBean getCustomerById(int id);
    void addCustomer(CustomerBean m);
    void deleteCust(int id);
    public void updateCustInfo(CustomerBean c);
}
