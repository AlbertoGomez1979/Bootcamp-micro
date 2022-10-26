package com.example.NTTData.Hibernate;

import java.util.Date;

import org.hibernate.Session;

import persistence.Contract;
import persistence.cliente;
import service.ClienteManagementServiceI;
import service.ClienteManagementServiceImpl;
import service.ContractManagementServiceI;
import service.ContractManagementServiceImpl;

public class Application {

	public static void main(String[] args) {

		// Apertura de sesión.
		final Session session = ApplicationHibernate.getSessionFactory().openSession();

		// Inicio de servicios.
		final ClienteManagementServiceI clientemanager = new ClienteManagementServiceImpl(session);
		final ContractManagementServiceI contractService = new ContractManagementServiceImpl(session);

		// Auditoría.
		final String updatedUser = "NTTSPORT_SYS";
		final Date updatedDate = new Date();

		// generación de clientes
		final cliente cl1 = new cliente();
		cl1.setNombre("Alberto");
		cl1.setApellido1("Gomez");
		cl1.setApellido2("Tejada");
		cl1.setDni("48811737d");
		
		// GENERACION DE CONTRATOS
		final Contract contract1 = new Contract();
		contract1.setSalary("1");
		contract1.setUpdatedDate(updatedDate);
		contract1.setUpdatedUser(updatedUser);
		final Contract contract2 = new Contract();
		contract2.setSalary("2");
		contract2.setUpdatedDate(updatedDate);
		contract2.setUpdatedUser(updatedUser);

		clientemanager.insertNewCliente(cl1);
		clientemanager.updateCliente(cl1);
		clientemanager.searchById(4);
		clientemanager.searchAll();
		
		contractService.insertNewContract(contract1);
		contractService.insertNewContract(contract2);

		System.out.println("El cliente es :" + cl1.toString());

	}

}
