package com.kexun.hr.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kexun.hr.model.Configfilesecondkind;
import com.kexun.hr.model.Configfilethirdkind;

public class ConfigfilethirdkindTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		
		
		//���Ը��ݶ�������������ѯ��������
		ConfigfilethirdkindMapper configfilethirdkindMapper=(ConfigfilethirdkindMapper)context.getBean("configfilethirdkindMapper");
		List<Configfilethirdkind> findBysecondKindIdConfigfilethirdkind = configfilethirdkindMapper.findBysecondKindIdConfigfilethirdkind(1);
		for (Configfilethirdkind configfilethirdkind : findBysecondKindIdConfigfilethirdkind) {
			System.out.println(configfilethirdkind);
		}
	}
}
