package com.codigorupestre.junit.miguelcarnero;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EliminacionUsuarioTest {
	
	AdministracionUsuarios administracionUsuarios;
	
	@Test
	public void eliminarUsuarioTest() {
		
		administracionUsuarios = new AdministracionUsuariosImpl();
		
		Usuario usuario = new Usuario();
		usuario.nombre = "Miguel";
		usuario.apellidos = "Carnero";
		usuario.telefono = "533445500112";
		usuario.email = "mcarnero@cocinaonline.org";
		
		boolean usuarioEliminado = administracionUsuarios.eliminarUsuario(usuario);
				
		assertTrue(usuarioEliminado);
		
	}

}
