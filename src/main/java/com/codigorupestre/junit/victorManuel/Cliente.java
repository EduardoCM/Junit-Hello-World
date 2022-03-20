package com.codigorupestre.junit.victorManuel;

public class Cliente {
	public String nombre;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public String DireccioEnvio;
	public String telefono;
	public String email;
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", DireccioEnvio=" + DireccioEnvio + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}

}
