package Tablas;
// Generated 11-ene-2021 21:44:03 by Hibernate Tools 5.4.18.Final

import java.util.HashSet;
import java.util.Set;

/**
 * EspaciosNaturales generated by hbm2java
 */
public class EspaciosNaturales implements java.io.Serializable {

	private Integer codEspacio;
	private String nombreEspacio;
	private String marca;
	private String natureType;
	private float latwgs84;
	private float longwgs84;
	private Set estaEns = new HashSet(0);

	public EspaciosNaturales() {
	}

	public EspaciosNaturales(String nombreEspacio, String marca, String natureType, float latwgs84, float longwgs84) {
		this.nombreEspacio = nombreEspacio;
		this.marca = marca;
		this.natureType = natureType;
		this.latwgs84 = latwgs84;
		this.longwgs84 = longwgs84;
	}

	public EspaciosNaturales(String nombreEspacio, String marca, String natureType, float latwgs84, float longwgs84,
			Set estaEns) {
		this.nombreEspacio = nombreEspacio;
		this.marca = marca;
		this.natureType = natureType;
		this.latwgs84 = latwgs84;
		this.longwgs84 = longwgs84;
		this.estaEns = estaEns;
	}

	public Integer getCodEspacio() {
		return this.codEspacio;
	}

	public void setCodEspacio(Integer codEspacio) {
		this.codEspacio = codEspacio;
	}

	public String getNombreEspacio() {
		return this.nombreEspacio;
	}

	public void setNombreEspacio(String nombreEspacio) {
		this.nombreEspacio = nombreEspacio;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNatureType() {
		return this.natureType;
	}

	public void setNatureType(String natureType) {
		this.natureType = natureType;
	}

	public float getLatwgs84() {
		return this.latwgs84;
	}

	public void setLatwgs84(float latwgs84) {
		this.latwgs84 = latwgs84;
	}

	public float getLongwgs84() {
		return this.longwgs84;
	}

	public void setLongwgs84(float longwgs84) {
		this.longwgs84 = longwgs84;
	}

	public Set getEstaEns() {
		return this.estaEns;
	}

	public void setEstaEns(Set estaEns) {
		this.estaEns = estaEns;
	}

}
