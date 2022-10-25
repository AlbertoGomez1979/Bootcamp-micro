package com.example.NTTData.Hibernate;

import org.hibernate.Session;

import persistence.cliente;
import service.ClienteManagementServiceI;
import service.ClienteManagementServiceImpl;



public class Application {

	public static void main(String[] args) {
		
		// Apertura de sesión.
				final Session session = ApplicationHibernate.getSessionFactory().openSession();	
				
		//Inicio de servicios.
				final ClienteManagementServiceI clientemanager = new ClienteManagementServiceImpl(session);
				
				//generación de clientes
			final cliente cl1 = new cliente();
			cl1.setNombre("Alberto");
			cl1.setApellido1("Gomez");
			cl1.setApellido2("Tejada");
			cl1.setDni("48811737d");
			
		clientemanager.insertNewCliente(cl1);
		clientemanager.updateCliente(cl1);
		clientemanager.searchById(4);
		clientemanager.searchAll();
		
		System.out.println("El cliente es :" + cl1.toString());
		
			
	}

	
}
