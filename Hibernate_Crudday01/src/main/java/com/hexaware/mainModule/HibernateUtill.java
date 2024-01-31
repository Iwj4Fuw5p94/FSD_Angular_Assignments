package com.hexaware.mainModule;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtill {
	private static SessionFactory sessionFactory;
	static {
	StandardServiceRegistry standar=new
			StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").
			build();
	Metadata metadata=new MetadataSources(standar).getMetadataBuilder().build();
	sessionFactory=metadata.getSessionFactoryBuilder().build();
	
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
			

}
