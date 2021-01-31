package Dao;

import Model.Item;
import java.util.List;

public interface ItemDao {
    //all crud ops here
    List<Item> getItemAll();   
    Item getItemById(int id);
    void addItem(Item m);
    public void deleteItem(int id);
//    int updateMenu(int id);
}
