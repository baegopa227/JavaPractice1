package com.test.kiuk.type;

import java.util.ArrayList;

import com.test.kiuk.item.TodoList;

/**
 * @author kiuk
 *
 */
public interface Human {

	public String getName();
	
	public int getAge();
	
	public int getMoney();
	
	public CarInfo getCarType();
	
	public ArrayList<TodoList> getItem();
}
