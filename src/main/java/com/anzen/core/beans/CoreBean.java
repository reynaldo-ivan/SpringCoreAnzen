package com.anzen.core.beans;

import org.hibernate.Session;

import com.anzen.dao.InsercionDAO;
import com.anzen.dao.imple.InsercionDAOImple;

public class CoreBean {
	
	private Persona persona=new Persona();
	private User user=new User();
	private InsercionDAOImple insercionDaAO=new InsercionDAO();
	
	private Session session;
	
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public InsercionDAOImple getInsercionDaAO() {
		return insercionDaAO;
	}
	public void setInsercionDaAO(InsercionDAOImple insercionDaAO) {
		this.insercionDaAO = insercionDaAO;
	}
	
	

}
