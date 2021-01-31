package Dao;

import Model.CustomerBean;
import Model.Item;
import Util.DBConUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao{

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs=null;

    @Override
    public List<Item> getItemAll() {
        List<Item> itemList = null;
        try{
            String sql = "SELECT * FROM BundleStock";
            itemList = new ArrayList<Item>();
            conn = DBConUtil.openConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Item m = new Item();
                m.setId(rs.getInt("id"));
                m.setItem(rs.getString("item"));
                m.setPrice(rs.getDouble("price"));
                m.setQuantity(rs.getInt("stock"));
                itemList.add(m);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return itemList;
    }

    @Override
    public void addItem(Item m) {
        try{
            conn = DBConUtil.openConnection();
            String sql = "insert into BundleStock (id, menu, price, quantity) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, m.getId());
            pstmt.setString(2, m.getItem());
            pstmt.setDouble(3, m.getPrice());
            pstmt.setInt(4, m.getQuantity());
            pstmt.execute();
            
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public Item getItemById(int id){
        Item item = new Item();
        try{
            String sql = "SELECT * FROM BundleStock where (id=?)";
            conn = DBConUtil.openConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                item.setId(rs.getInt("id"));
                item.setItem(rs.getString(2));
                item.setPrice(rs.getDouble(3));
                item.setQuantity(rs.getInt(4));
            }
                
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        
        return item;
    }
    
    public void deleteItem(int id){
        try{
            conn = DBConUtil.openConnection();
            String sql = "delete from BundleStock where (id = ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void updateItemInfo(Item c) {
        try{
            conn = DBConUtil.openConnection();
            String sql = "update BundleStock set item=?, price = ?, quantity=? where itemId = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, c.getItem());
            pstmt.setDouble(2, c.getPrice());
            pstmt.setInt(3, c.getQuantity());
            pstmt.setInt(4, c.getId());
            pstmt.executeUpdate();
            conn.close();

        }
         catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
