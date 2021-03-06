package Tablas;
// Generated 19-ene-2021 15:28:32 by Hibernate Tools 5.4.18.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Estaciones generated by hbm2java
 */
public class Estaciones implements java.io.Serializable {

	private Integer codEstacion;
	private Municipios municipios;
	private String nombre;
	private String direccion;
	private float coordenadaX;
	private float coordenadaY;
	private float latitud;
	private float longitud;
	private Set datosCalidads = new HashSet(0);

	public Estaciones() {
	}

	public Estaciones(Municipios municipios, String nombre, String direccion, float coordenadaX, float coordenadaY,
			float latitud, float longitud) {
		this.municipios = municipios;
		this.nombre = nombre;
		this.direccion = direccion;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Estaciones(Municipios municipios, String nombre, String direccion, float coordenadaX, float coordenadaY,
			float latitud, float longitud, Set datosCalidads) {
		this.municipios = municipios;
		this.nombre = nombre;
		this.direccion = direccion;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.latitud = latitud;
		this.longitud = longitud;
		this.datosCalidads = datosCalidads;
	}

	public Integer getCodEstacion() {
		return this.codEstacion;
	}

	public void setCodEstacion(Integer codEstacion) {
		this.codEstacion = codEstacion;
	}

	public Municipios getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Municipios municipios) {
		this.municipios = municipios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getCoordenadaX() {
		return this.coordenadaX;
	}

	public void setCoordenadaX(float coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public float getCoordenadaY() {
		return this.coordenadaY;
	}

	public void setCoordenadaY(float coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public float getLatitud() {
		return this.latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return this.longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public Set getDatosCalidads() {
		return this.datosCalidads;
	}

	public void setDatosCalidads(Set datosCalidads) {
		this.datosCalidads = datosCalidads;
	}

}
