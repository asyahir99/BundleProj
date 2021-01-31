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
            String sql = "SELECT * FROM user";
            customerList = new ArrayList<CustomerBean>();
            conn = DBConUtil.openConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                CustomerBean m = new CustomerBean();
                m.setId(rs.getInt("uid"));
                m.setName(rs.getString("name"));
                m.setEmail(rs.getString("email"));
                m.setCategory(rs.getString("category"));
                m.setPassword(rs.getString("password"));
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
            String sql = "insert into user (name, email, category, password) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getName());
            pstmt.setString(2, m.getEmail());
            pstmt.setString(3, m.getCategory());
            pstmt.setString(4, m.getPassword());
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
            String sql = "Select * From user where (uid=?)";
            conn = DBConUtil.openConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                customer.setId(rs.getInt("uid"));
                customer.setName(rs.getString("name"));
                customer.setEmail(rs.getString("email"));
                customer.setPassword(rs.getString("password"));
                customer.setCategory(rs.getString("category"));
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
            String sql = "delete from user where (uid = ?)";
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
            String sql = "update user set name=?, category = ?, email=?, weight = ? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getName());
            pstmt.setString(2, c.getCategory());
            pstmt.setString(3, c.getEmail());
            pstmt.setString(4, c.getPassword());
            pstmt.execute();
            conn.close();

        }
         catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
