package com.liyiruo;

import com.liyiruo.bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot01HelloInitApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	Emp emp;
	@Test
	public void t() {
		System.out.println("emp==>" + emp);
		//System.out.println("emp==>" + emp.getLastName());
	}

}
