package com.sparta.testcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootTest
class TestcicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDot(){
		System.out.println("start-------------");
		Dotenv dotenv = Dotenv.load();
		System.out.println("RDS_HOSTNAME: " + dotenv.get("RDS_HOSTNAME"));
		System.out.println("RDS_PORT: " + dotenv.get("RDS_PORT"));
	}

}
