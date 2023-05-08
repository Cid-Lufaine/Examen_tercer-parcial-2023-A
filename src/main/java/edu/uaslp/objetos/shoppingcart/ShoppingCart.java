package edu.uaslp.objetos.shoppingcart;
import edu.uaslp.objetos.shoppingcart.ShoppingItemCatalog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingCart {

    private int totalCost;
    private int distinctItemsCount;
    private int totalItemsCount;
    public ShoppingCart (){

    }
    public ShoppingCart (ShoppingItemCatalog shoppingItemCatalog){

    }
    public void add(String name) throws ItemNotFoundException{
        boolean found=false;

        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();


        ShoppingItem item = shoppingItemCatalog.getItem(name);
        if(item ==null)
        {
            throw new ItemNotFoundException(name);
        }else {

        }


    }

    public int getTotalCostInCents() {
        return totalCost;
    }

    public int getDistinctItemsCount() {
        return distinctItemsCount;
    }


    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    public List<ShoppingItem> getItems() {

        List<ShoppingItem> shoppingItems = new ArrayList<ShoppingItem>();

        return shoppingItems;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        Collection<ShoppingItem> shoppingDistinctItems = new ArrayList<ShoppingItem>();
        return shoppingDistinctItems;
    }
}
