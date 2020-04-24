package com.test.kiuk.run;

import com.test.kiuk.customer.Man;
import com.test.kiuk.customer.Woman;
import com.test.kiuk.service.Info;
import com.test.kiuk.type.Human;

/**
 * @author kiuk
 *
 */
public class Run {

	public static void main(String[] args) {

		
		Info info = new Info();
		
		Human man = new Man();
		Human woman = new Woman();
		
		boolean isInfo = info.info(man);
		if(isInfo) {
			System.out.println("감사합니다!!!");
		}else {
			System.out.println("다시 이용해주세요...");
		}
	}

}
