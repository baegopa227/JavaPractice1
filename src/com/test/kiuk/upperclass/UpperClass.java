package com.test.kiuk.upperclass;

import com.test.kiuk.constant.Constant;

public abstract class UpperClass {

	public abstract void preHandler();
	
	public abstract void proHandler();
	
	public abstract void postHandler();
	
	public boolean washLogic(int carType , int customerTodoDetail) {
		
		if(carType == Constant.SMALL) {
			System.out.println("smallType");
		}else if (carType == Constant.MIDDLE) {
			System.out.println("middleType");
		}else if (carType == Constant.LARGE) {
			System.out.println("largeType");
		}else {
			System.out.println("없는 타입입니다.");
			return false;
		}
		if(customerTodoDetail == Constant.WASHCHEAP) {
			System.out.println("싼가격 세차");
		}else if (customerTodoDetail == Constant.WASHNORMAL) {
			System.out.println("중간가격 세차");
		}else if (customerTodoDetail == Constant.WASHEXPENSIVE) {
			System.out.println("비싼가격 세차");
		}else {
			System.out.println("없는 세차 타입입니다.");
			return false;
		}
		return true;
	}
	
	public boolean fuelLogic(int inletType, int customerTodoDetail) {
		
		if(inletType == Constant.GASOLINE) {
			System.out.println("해당차량은 가솔린입니다.");
		}else if (inletType == Constant.GAS) {
			System.out.println("해당차량은 가스 차입니다.");
		}else if (inletType == Constant.DIESEL) {
			System.out.println("해당차량은 디젤 차입니다.");
		}else {
			System.out.println("없는 타입의 차량입니다.");
			return false;
		}
		if(customerTodoDetail == Constant.FUELCHEAP) {
			System.out.println("선택하신 것은 싼가격 연료입니다.");
		}else if (customerTodoDetail == Constant.FUELNORMAL) {
			System.out.println("선택하신 것은 중간가격 연료입니다.");
		}else if (customerTodoDetail == Constant.FUELEXPENSIVE) {
			System.out.println("선택하신 것은 비싼가격 연료입니다.");
		}else {
			System.out.println("없는 세차 타입입니다.");
			return false;
		}
		
		return true;
		
		
	}
	
	public boolean repairLogic(int carType, int customerTodoDetail) {
		
		if(carType == Constant.SMALL) {
			System.out.println("smallType");
		}else if (carType == Constant.MIDDLE) {
			System.out.println("middleType");
		}else if (carType == Constant.LARGE) {
			System.out.println("largeType");
		}else {
			System.out.println("없는 타입입니다.");
			return false;
		}
		if(customerTodoDetail == Constant.REPAIRCHEAP) {
			System.out.println("선택하신 수리방법은 싼 가격입니다.");
		}else if (customerTodoDetail == Constant.REPAIRNORMAL) {
			System.out.println("선택하신 수리방법은 중간 가격입니다.");
		}else if (customerTodoDetail == Constant.REPAIREXPENSIVE) {
			System.out.println("선택하신 수리방법은 비싼 가격입니다.");
		}else {
			System.out.println("없는 세차 타입입니다.");
			return false;
		}
		
		return true;
		
		
	}
}
