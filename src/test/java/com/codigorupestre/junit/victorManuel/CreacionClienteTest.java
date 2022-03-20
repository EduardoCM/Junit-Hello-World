package com.codigorupestre.junit.victorManuel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CreacionClienteTest {
	
	AdministrarClientes administracionClientes;
	@Test
	public void crearClienteTest() {
		administracionClientes=new AdministrarClientesImpl();
		
		Cliente cliente=new Cliente();
		
		cliente.nombre="Victor";
		cliente.apellidoPaterno="Manuel";	
		cliente.apellidoMaterno="perez";
		cliente.DireccioEnvio="Mexico";
		cliente.email="victor@curso.com";
		cliente.telefono="9998765432";

		boolean ClienteNuevo=administracionClientes.craerClientes(cliente);
			
		assertTrue(ClienteNuevo);
	}

}
