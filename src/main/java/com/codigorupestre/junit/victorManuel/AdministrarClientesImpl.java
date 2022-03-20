package com.codigorupestre.junit.victorManuel;

public class AdministrarClientesImpl implements AdministrarClientes {

	@Override
	public boolean craerClientes(Cliente cliente) {
		
		System.out.println("Creando cliente "+ cliente );
		System.out.println("Cliente registrado en BD exitosamente");
		System.out.println("Envio de correo  de confirmacion a "+cliente.email);
		System.out.println("Envio correo de recuperacion de cuenta a "+ cliente.email);
		
	
		return false;
	}

}
