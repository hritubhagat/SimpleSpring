package com.hritu.service;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hritu.dto.AccountDTO;

public class AccountService {
	public static void add(AccountDTO dto){
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		System.out.println("Account added successfully");
	}	
	public static void update(AccountDTO dto){
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();
		System.out.println("Account updated successfully");
	} 
	public static void delete(AccountDTO dto){
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
		System.out.println("Account deleted successfully");
	} 
	public static AccountDTO get(int id){
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		AccountDTO dto=(AccountDTO)session.get(AccountDTO.class, id);
		return dto;
	}
}
