package com.test.kiuk.service;

import com.test.kiuk.item.TodoList;
import com.test.kiuk.upperclass.UpperClass;

public class GasStation extends UpperClass {

	private int customerTodoDetail;
	private int inletType;
	
	public GasStation(TodoList todo, int inletType) {
		this.customerTodoDetail = todo.getTodoDetail();
		this.inletType = inletType;
		
		preHandler();
	}
	
	@Override
	public void preHandler() {
		boolean isFuel = fuelLogic(inletType, customerTodoDetail);
		if(isFuel) {
			System.out.println("주유 가능");
			proHandler();
			
		}else {
			System.out.println("주유 불가능");
			return;
		}
	}

	@Override
	public void proHandler() {
		System.out.println("주유 중입니다");
		postHandler();
	}

	@Override
	public void postHandler() {
		System.out.println("주유 완료!!");
	}

}
