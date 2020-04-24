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
public class Man implements Human {

	@Override
	public String getName() {
		return "man";
	}


	@Override
	public ArrayList<TodoList> getItem() {
		ArrayList<TodoList> list = new ArrayList<TodoList>();
		
		TodoList todo = new TodoList();
		todo.setTodoType(Constant.FUEL);
		todo.setTodoDetail(Constant.FUELCHEAP);
		list.add(todo);
		
		TodoList todo1 = new TodoList();
		todo1.setTodoType(Constant.WASH);
		todo1.setTodoDetail(Constant.WASHNORMAL);
		list.add(todo1);
		
		TodoList todo2 = new TodoList();
		todo2.setTodoType(Constant.REPAIR);
		todo2.setTodoDetail(Constant.REPAIRCHEAP);
		list.add(todo2);
		
		return list;
	}


	@Override
	public int getAge() {
		return 29;
	}


	@Override
	public CarInfo getCarType() {
		CarInfo carInfo = new CarInfo();
		carInfo.setCarType(Constant.SMALL);
		carInfo.setInletType(Constant.GAS);
		
		return carInfo;
	}


	@Override
	public int getMoney() {
		return 500000;
	}

}
