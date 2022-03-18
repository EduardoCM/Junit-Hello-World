package com.codigorupestre.junit.miguelcarnero;

public class AdministracionUsuariosImpl implements AdministracionUsuarios {

	@Override
	public boolean crearUsuario(Usuario usuario) {
		System.out.println("Creando usuario " + usuario);
		
		System.out.println("Validar que el usuario no exista");
		
		System.out.println("Registrando usuario en base datos");
		
		System.out.println("Enviar email " + usuario.email + " al usuario de confirmacion");
		
		return true;
	}

	@Override
	public boolean eliminarUsuario(Usuario usuario) {
		System.out.println("Eliminando usuario " + usuario);
		
		System.out.println("Validar que el usuario existe");
		
		System.out.println("Eliminando usuario de la base de datos");
		
		return true;
	}
	
}
