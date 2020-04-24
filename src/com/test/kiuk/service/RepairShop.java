package com.test.kiuk.service;

import com.test.kiuk.item.TodoList;
import com.test.kiuk.upperclass.UpperClass;

public class RepairShop extends UpperClass {
	private int customerTodoDetail;
	private int carType;
	
	public RepairShop(TodoList todo,int customerCarType) {
		this.customerTodoDetail = todo.getTodoDetail();
		this.carType = customerCarType;
		
		preHandler();
	}
	
	@Override
	public void preHandler() {
		boolean isRepair = repairLogic(carType, customerTodoDetail);
		if(isRepair) {
			System.out.println("수리 가능");
			proHandler();
			
		}else {
			System.out.println("수리 불가능");
			return;
			
		}
	}

	@Override
	public void proHandler() {
		System.out.println("수리 중입니다");
		postHandler();
	}

	@Override
	public void postHandler() {
		System.out.println("수리 완료!!");
	}

	
}
