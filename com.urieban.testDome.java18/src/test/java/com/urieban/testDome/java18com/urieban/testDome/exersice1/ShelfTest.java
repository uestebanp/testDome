package com.urieban.testDome.java18com.urieban.testDome.exersice1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.urieban.testDome.exersice1.Shelf;

public class ShelfTest {
	
	@Test
    public void shelfCanAcceptAndReturnItem() {
        Shelf shelf = new Shelf();
        shelf.put("Orange");
        Assert.assertTrue(shelf.take("Orange"));
    }
	
	@Test
	public void shelfNullOrEmptyPutDoNothing() {
		Shelf shelf = new Shelf();
		shelf.put(null);
		shelf.put(new String(""));
		assertFalse(shelf.take(null));
		assertFalse(shelf.take(new String("")));
	}
	
	@Test
	public void shelfJustOneItemAccepted() {
		Shelf shelf = new Shelf();
		String repeatedItem = new String("JustOne");
		shelf.put(repeatedItem);
		shelf.put(repeatedItem);
		Integer countItems = 0;
		Boolean isTakenItem = Boolean.TRUE;
		while(isTakenItem) {
			isTakenItem = shelf.take(repeatedItem);
			if(isTakenItem) {
				countItems++;
			}
		}
		assertTrue(countItems <= 1);
	}
	
	@Test
	public void shelfItemsAccepted() {
		Shelf shelf = new Shelf();
		String repeatedItem = new String("JustOne");
		shelf.put(repeatedItem);
		assertTrue(shelf.take(repeatedItem));
		shelf.put(repeatedItem);
		assertTrue(shelf.take(repeatedItem));
	}
	
}
