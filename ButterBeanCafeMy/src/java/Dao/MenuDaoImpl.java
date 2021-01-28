package Dao;

import Model.CustomerBean;
import Model.Menu;
import Util.DBConUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MenuDaoImpl implements MenuDao{

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs=null;

    @Override
    public List<Menu> getMenuAll() {
        List<Menu> menuList = null;
        try{
            String sql = "SELECT * FROM MENU";
            menuList = new ArrayList<Menu>();
            conn = DBConUtil.openConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Menu m = new Menu();
                m.setId(rs.getInt("id"));
                m.setMenu(rs.getString("menu"));
                m.setPrice(rs.getDouble("price"));
                m.setQuantity(rs.getInt("stock"));
                menuList.add(m);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return menuList;
    }

    @Override
    public void addMenu(Menu m) {
        try{
            conn = DBConUtil.openConnection();
            String sql = "insert into menu (id, menu, price, quantity) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, m.getId());
            pstmt.setString(2, m.getMenu());
            pstmt.setDouble(3, m.getPrice());
            pstmt.setInt(4, m.getQuantity());
            pstmt.execute();
            
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public Menu getMenuById(int id){
        Menu menu = new Menu();
        try{
            String sql = "SELECT * FROM MENU where (id=?)";
            conn = DBConUtil.openConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while(rs.next()){
                menu.setId(rs.getInt("id"));
                menu.setMenu(rs.getString(2));
                menu.setPrice(rs.getDouble(3));
                menu.setQuantity(rs.getInt(4));
            }
                
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        
        return menu;
    }
    
    public void deleteMenu(int id){
        try{
            conn = DBConUtil.openConnection();
            String sql = "delete from menu where (id = ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}
