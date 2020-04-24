package com.test.kiuk.service;

import java.util.ArrayList;

import com.test.kiuk.constant.Constant;
import com.test.kiuk.item.TodoList;
import com.test.kiuk.type.CarInfo;
import com.test.kiuk.type.Human;
import com.test.kiuk.upperclass.UpperClass;

/**
 * @author kiuk
 *
 */
public class Info extends UpperClass{

	private String customerName;
	private int customerAge;
	private int customerMoney;
	private CarInfo customerCarInfo;
	private ArrayList<TodoList> customerTodoList;
	
	
	public Info() {
		System.out.println("information!!!");
	}

	public boolean info(Human human) {
		
		this.customerName = human.getName();
		this.customerAge = human.getAge();
		this.customerMoney = human.getMoney();
		this.customerCarInfo = human.getCarType();
		this.customerTodoList = human.getItem();
		
		preHandler();
		
		return true;
	}

	@Override
	public void preHandler() {
		System.out.println("이름 : " + customerName + " , 나이 : " + customerAge);
		System.out.println("보유중인 금액 : " + customerMoney);
		System.out.println("customerTodoList : ");
		
		
		
		if(customerTodoList.size() > 0) {
			proHandler();
		}
		
	}

	@Override
	public void proHandler() {
		
		int customerCarType =  customerCarInfo.getCarType();
		int customerInletType = customerCarInfo.getInletType();
		
		
		for(TodoList todo : customerTodoList) {
			int key = todo.getTodoType();
			switch (key) {
			case Constant.WASH:
			
				int customerMoneyToPay = todo.getTodoDetail();
				if(customerMoney - ( customerMoneyToPay + customerCarType ) >= 0) {
					customerMoney -= ( customerMoneyToPay + customerCarType );
					new Wash(todo, customerCarType);
				
				}else {
					System.out.println("서비스를 이용하시기에는 돈이 부족합니다.");
				}
				
				
				break;
				
			case Constant.FUEL:
				
				int customerMoneyToPay1 = todo.getTodoDetail();
				if(customerMoney - ( customerMoneyToPay1 + customerInletType) >=0) {
					customerMoney -= (customerMoneyToPay1 + customerInletType);
					new GasStation(todo, customerInletType);
				}else {
					System.out.println("서비스를 이용하시기에는 돈이 부족합니다.");
				}
				
				
				 
				break;
				
			case Constant.REPAIR:
				
				int customerMoneyToPay2 = todo.getTodoDetail();
				if(customerMoney - ( customerMoneyToPay2 + customerCarType) >=0) {
					customerMoney -= (customerMoneyToPay2 + customerCarType);
					new RepairShop(todo, customerCarType);
				}else {
					System.out.println("서비스를 이용하시기에는 돈이 부족합니다.");
				}
				
			
				break;
				
			default:
				System.out.println("지원하지 않는 서비스입니다.");
				break;
			}
		}
	}

	@Override
	public void postHandler() {
		
	}
	
	
}
