package com.hritu.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hritu.dto.AccountDTO;
import com.hritu.service.AccountService;

public class AccountTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("setUpBeforeClass().....");
	}
	@Before
	public void stepUp(){
		System.out.println("stepUp().....");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown().....");
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("tearDownAfterClass().....");
	}
	
	@Test
	public void testAdd(){
		AccountDTO dto=new AccountDTO();
		dto.setId(1);
		dto.setBalance(50000);
		dto.setName("Hritu");
		dto.setNumber("SBI1234");
		AccountService.add(dto);
		dto=AccountService.get(1);
		assertNotNull("Account not added",dto);
	}
	@Test
	public void testUpdate(){
		AccountDTO dto=new AccountDTO();
		dto.setId(1);
		/*dto.setBalance(90000);
		dto.setNumber("SBI1234");*/
		dto.setName("Sapan");
		AccountService.update(dto);
		dto=AccountService.get(1);
		assertEquals("Account not updated","Sapan".equals(dto.getName()));
	}
	@Test
	public void testDelete(){
		AccountDTO dto=new AccountDTO();
		dto.setId(1);
		AccountService.delete(dto);
		dto=AccountService.get(1);
		assertNull("Account not deleted",dto);
	}
	@Test
	public void testGet(){
		AccountDTO dto=new AccountDTO();
		assertNotNull("Account not found",dto);
	}

}
