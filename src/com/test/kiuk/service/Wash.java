package com.test.kiuk.service;

import com.test.kiuk.item.TodoList;
import com.test.kiuk.upperclass.UpperClass;

/**
 * @author kiuk
 *
 */
public class Wash extends UpperClass{

	private int customerTodoDetail;
	private int carType;
	
	public Wash(TodoList todo, int carType) {
		this.customerTodoDetail = todo.getTodoDetail();
		this.carType = carType;
		
		preHandler();
	}
	
	@Override
	public void preHandler() {
		boolean isWash = washLogic(carType, customerTodoDetail);
		if(isWash) {
			System.out.println("세차 가능");
			proHandler();
			
		}else {
			System.out.println("세차 불가능");
			return;
		}
	}

	@Override
	public void proHandler() {
		System.out.println("세차 중입니다");
		postHandler();
	}

	@Override
	public void postHandler() {
		System.out.println("세차 완료!!");
	}

}
