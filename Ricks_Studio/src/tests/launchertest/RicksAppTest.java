package tests.launchertest;


import org.junit.Assert;
import org.junit.Test;

import models.Guitar;
import models.Inventory;

public class RicksAppTest {
    private Inventory inventory = new Inventory();
    public RicksAppTest(){
        populateInventory();
    }
    @Test
    public void testWorking(){
        System.out.println("Welcome to Ricks Guitar Studio!");
        Assert.assertEquals(145.0, inventory.getGuitar("2").getPrice(),0);
    
    }
    private void populateInventory(){
        inventory.addGuitar(getGuitar("1", 134));
        inventory.addGuitar(getGuitar("2", 145));
        inventory.addGuitar(getGuitar("3", 198));
    }
    private static Guitar getGuitar(String srnoString, double price){
        return new Guitar(srnoString, "Top", "back", "builder", "model", "type", price);
    }
}
