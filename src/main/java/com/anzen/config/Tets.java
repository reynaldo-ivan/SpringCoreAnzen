package com.anzen.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anzen.core.beans.CoreBean; 

public class Tets {
	static ApplicationContext appContext=null;
	static CoreBean coreBean=null;
	
	public static void main(String[] args) {
		
//		appContext=new ClassPathXmlApplicationContext("/coreBean.xml");
		appContext=new AnnotationConfigApplicationContext(AppConfig.class);  
 
		coreBean=(CoreBean) appContext.getBean("coreConfig");
		 
//		coreBean.getPersona().setId("ddd");
//		coreBean.getPersona().setApellidoMaterno("lopez ww");
//		coreBean.getPersona().setApellidoPatermo("Maerinez a");
//		coreBean.getPersona().setNombre("reynaldo");
		
		
		String nomn=coreBean.getInsercionDaAO().consulta("Reynald");
		
		System.out.println("nomn  "+nomn);
		
		coreBean.getInsercionDaAO().insertPersona(coreBean.getPersona());
		
		System.out.println("apellido materno  "+coreBean.getUser().getUsername());
		 
		  
    }

}
