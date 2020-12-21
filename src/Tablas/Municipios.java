package Tablas;
// Generated 21-dic-2020 15:41:45 by Hibernate Tools 5.4.18.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Municipios generated by hbm2java
 */
public class Municipios implements java.io.Serializable {

	private int codMunicipio;
	private Provincias provincias;
	private String nombre;
	private Set estacioneses = new HashSet(0);
	private Set estaEns = new HashSet(0);

	public Municipios() {
	}

	public Municipios(int codMunicipio, Provincias provincias, String nombre) {
		this.codMunicipio = codMunicipio;
		this.provincias = provincias;
		this.nombre = nombre;
	}

	public Municipios(int codMunicipio, Provincias provincias, String nombre, Set estacioneses, Set estaEns) {
		this.codMunicipio = codMunicipio;
		this.provincias = provincias;
		this.nombre = nombre;
		this.estacioneses = estacioneses;
		this.estaEns = estaEns;
	}

	public int getCodMunicipio() {
		return this.codMunicipio;
	}

	public void setCodMunicipio(int codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public Provincias getProvincias() {
		return this.provincias;
	}

	public void setProvincias(Provincias provincias) {
		this.provincias = provincias;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getEstacioneses() {
		return this.estacioneses;
	}

	public void setEstacioneses(Set estacioneses) {
		this.estacioneses = estacioneses;
	}

	public Set getEstaEns() {
		return this.estaEns;
	}

	public void setEstaEns(Set estaEns) {
		this.estaEns = estaEns;
	}

}
