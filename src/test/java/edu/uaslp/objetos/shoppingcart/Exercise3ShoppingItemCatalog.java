package edu.uaslp.objetos.shoppingcart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        // Given:
        ShoppingItemCatalog shoppingItemCatalog = Mockito.mock(ShoppingItemCatalog.class);
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItemCatalog);
        String itemCode = "9785";
        ShoppingItem shoppingItem = shoppingItemCatalog.getItem(itemCode);
        when(shoppingItemCatalog.getItem(itemCode)).thenThrow(new ItemNotFoundException("Item with code 9785 not found"));

        Assertions.assertThat(shoppingItem.getCode()).isEqualTo(null);

    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        // Given:
        ShoppingItemCatalog shoppingItemCatalog = Mockito.mock(ShoppingItemCatalog.class);
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItemCatalog);
        String itemCode = "ABC1000";
        ShoppingItem shoppingItem = shoppingItemCatalog.getItem(itemCode);
        Assertions.assertThat(shoppingItem.getCode()).isEqualTo("ABC1000");



    }
}
