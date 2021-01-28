/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author ahmad
 */
import Model.CustomerBean;
import Util.DBConUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CustomerDaoImpl implements CustomerDao{
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs=null;

    @Override
    public List<CustomerBean> getCustomerAll() {
        List<CustomerBean> customerList = null;
        try{
            String sql = "SELECT * FROM customer";
            customerList = new ArrayList<CustomerBean>();
            conn = DBConUtil.openConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                CustomerBean m = new CustomerBean();
                m.setId(rs.getInt("uid"));
                m.setName(rs.getString("name"));
                m.setHeight(rs.getDouble("height"));
                m.setWeight(rs.getDouble("weight"));
                m.setYob(rs.getInt("yob"));
                customerList.add(m);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void addCustomer(CustomerBean m) {
        try{
            conn = DBConUtil.openConnection();
            String sql = "insert into customer (name, yob, weight, height) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getName());
            pstmt.setInt(2, m.getYob());
            pstmt.setDouble(3, m.getWeight());
            pstmt.setDouble(4, m.getHeight());
            pstmt.execute();
            
        } 
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public CustomerBean getCustomerById(int id){
        CustomerBean customer = new CustomerBean();
        try{
            String sql = "Select * From customer where (uid=?)";
            conn = DBConUtil.openConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                customer.setId(rs.getInt("uid"));
                customer.setName(rs.getString("name"));
                customer.setYob(rs.getInt("yob"));
                customer.setWeight(rs.getDouble("weight"));
                customer.setHeight(rs.getDouble("height"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return customer;
    }
    
    @Override
    public void deleteCust(int id){
        try{
            conn = DBConUtil.openConnection();
            String sql = "delete from customer where (uid = ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public void updateCustInfo(CustomerBean c) {
        try{
            conn = DBConUtil.openConnection();
            String sql = "update customer set name=?, yob = ?, height=?, weight = ? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getName());
            pstmt.setInt(2, c.getYob());
            pstmt.setDouble(3, c.getWeight());
            pstmt.setDouble(4, c.getHeight());
            pstmt.execute();
            conn.close();

        }
         catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
