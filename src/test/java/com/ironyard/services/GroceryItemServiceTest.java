package com.ironyard.services;

import com.ironyard.data.GroceryItem;
import com.ironyard.data.Pet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by osmanidris on 1/31/17.
 */
public class GroceryItemServiceTest {
    @Before
    public void truncateBefore(){
        System.out.println("truncateBefore");
        DbService ds = new DbService();
        ds.truncate("helloworld.Items");
        ds.restartSequence("helloworld.items_id_seq");
    }

    @Test
    public void getAllItemsFromDatabase() throws Exception {
        // TODO .. First insert stuff
        this.saveToDatabase();
        System.out.println("getAllItemssFromDatabase");
        GroceryItemService gs = new GroceryItemService();
        List<GroceryItem> found = gs.getAllItemsFromDatabase();

        assertEquals("Found unexpected number of rows.",1, found.size());
    }

    @Test
    public void saveToDatabase() throws Exception {
        System.out.println("saveToDatabase");
        GroceryItemService gs = new GroceryItemService();
        GroceryItem saveMe = new GroceryItem("Patato",7,5.4,3);
        //
        GroceryItem saved = gs.save(saveMe);

        // fetch by name
        GroceryItem found = gs.getItemByName("Patato");
        assertEquals("Name 404",saveMe.getName(), found.getName());
        assertEquals("getColor 404",saveMe.getIsle(), found.getIsle());
        assertEquals("getType 404",saveMe.getPrice(), found.getPrice(), .002);
        assertEquals("getAge 404",saveMe.getCategory(), found.getCategory());
    }

}
