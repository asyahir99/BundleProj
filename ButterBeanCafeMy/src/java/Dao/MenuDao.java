package Dao;

import Model.Menu;
import java.util.List;

public interface MenuDao {
    //all crud ops here
    List<Menu> getMenuAll();   
    Menu getMenuById(int id);
    void addMenu(Menu m);
    public void deleteMenu(int id);
//    int updateMenu(int id);
}
