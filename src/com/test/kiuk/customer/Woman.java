package com.test.kiuk.customer;

import java.util.ArrayList;

import com.test.kiuk.constant.Constant;
import com.test.kiuk.item.TodoList;
import com.test.kiuk.type.CarInfo;
import com.test.kiuk.type.Human;

/**
 * @author kiuk
 *
 */
public class Woman implements Human {

	@Override
	public String getName() {
		return "woman";
	}


	@Override
	public ArrayList<TodoList> getItem() {
		ArrayList<TodoList> list = new ArrayList<TodoList>();
		
		TodoList todo = new TodoList();
		todo.setTodoType(Constant.FUEL);
		todo.setTodoDetail(Constant.FUELEXPENSIVE);
		list.add(todo);
		
		return list;
	}


	@Override
	public int getAge() {
		return 29;
	}


	@Override
	public CarInfo getCarType() {
		CarInfo carInfo = new CarInfo();
		carInfo.setCarType(Constant.MIDDLE);
		carInfo.setInletType(Constant.DIESEL);
		return carInfo;
	}


	@Override
	public int getMoney() {
		return 20000;
	}

}
