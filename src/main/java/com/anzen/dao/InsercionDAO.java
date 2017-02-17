package com.anzen.dao;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anzen.config.AppConfig;
import com.anzen.core.beans.CoreBean;
import com.anzen.core.beans.Persona;
import com.anzen.dao.imple.InsercionDAOImple;
import com.anzen.hibernate.util.HibernateUtil;

public class InsercionDAO  implements InsercionDAOImple{
	
	  ApplicationContext appContext=null;
	  CoreBean coreBean=null;
	public String insertPersona(Persona persona) {
		
		
//		appContext=new ClassPathXmlApplicationContext("/coreBean.xml");
		appContext=new AnnotationConfigApplicationContext(AppConfig.class);  
 
		coreBean=(CoreBean) appContext.getBean("coreConfig");
		Session session=HibernateUtil.getSessionFactory().openSession();
  
		session.beginTransaction();  
        coreBean.setPersona(persona);
          
        session.save(coreBean.getPersona());
        session.getTransaction().commit();
		
		return "Insercion Correcta";
	}
	public String consulta(String nombre) {
		
		return nombre;
	}
	
	 

}
