package com.bhagat.hritu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bhagat.hritu.dto.AddressDTO;
import com.bhagat.hritu.dto.StudentDTO;

public class SpringTest {
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		StudentDTO dto=(StudentDTO)factory.getBean("stdObj");
		System.out.println(dto.getAge());
		System.out.println(dto.getName());
		AddressDTO add=dto.getAddress();
		System.out.println(add.getStreet());
		System.out.println(add.getPin());
		System.out.println(add.getCity());
		
	}

}
