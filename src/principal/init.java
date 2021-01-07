package principal;

import Insert.Consultas;

public class init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consultas consultas = new Consultas();
		
		//INSERTAR PROVINCIAS
		consultas.insertProvincias();
		System.out.println();
		
		//INSERTAR MUNICIPIO
		consultas.insertMunicipios();
		System.out.println();
		
		//INSERTAR ESTACIONES
		consultas.insertEstaciones();
		System.out.println();
		
		//INSERTAR DATOS CALIDAD
		consultas.insertDatosCalidad();
		System.out.println();
		
		//INSERTAR ESPACIOS NATURALES
		consultas.insertEspaciosNaturales();
		System.out.println();
		
		//INSERTAR USUARIOS
		consultas.insertUsuarios();
		System.out.println();
		
		//INSERTAR FAVORITOS
		consultas.insertFavoritos();
		System.out.println();
		
		//INSERTAR HASH
		consultas.insertHash();

		//INSERTAR ESTA EN
		consultas.insertEstaEn();

	}

}
