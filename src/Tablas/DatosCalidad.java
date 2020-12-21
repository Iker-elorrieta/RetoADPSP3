package Tablas;
// Generated 21-dic-2020 15:41:45 by Hibernate Tools 5.4.18.Final

import java.util.Date;

/**
 * DatosCalidad generated by hbm2java
 */
public class DatosCalidad implements java.io.Serializable {

	private Integer codDatos;
	private Estaciones estaciones;
	private Date fecha;
	private Date hora;
	private float comgM3;
	private float co8hmgM3;
	private int nogm3;
	private int no2;
	private String no2ica;
	private int noxgm3;
	private float pm10;
	private String pm10ica;
	private float pm25;
	private String pm25ica;
	private float so2;
	private String so2ica;
	private String icastation;

	public DatosCalidad() {
	}

	public DatosCalidad(Estaciones estaciones, Date fecha, Date hora, float comgM3, float co8hmgM3, int nogm3, int no2,
			String no2ica, int noxgm3, float pm10, String pm10ica, float pm25, String pm25ica, float so2, String so2ica,
			String icastation) {
		this.estaciones = estaciones;
		this.fecha = fecha;
		this.hora = hora;
		this.comgM3 = comgM3;
		this.co8hmgM3 = co8hmgM3;
		this.nogm3 = nogm3;
		this.no2 = no2;
		this.no2ica = no2ica;
		this.noxgm3 = noxgm3;
		this.pm10 = pm10;
		this.pm10ica = pm10ica;
		this.pm25 = pm25;
		this.pm25ica = pm25ica;
		this.so2 = so2;
		this.so2ica = so2ica;
		this.icastation = icastation;
	}

	public Integer getCodDatos() {
		return this.codDatos;
	}

	public void setCodDatos(Integer codDatos) {
		this.codDatos = codDatos;
	}

	public Estaciones getEstaciones() {
		return this.estaciones;
	}

	public void setEstaciones(Estaciones estaciones) {
		this.estaciones = estaciones;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public float getComgM3() {
		return this.comgM3;
	}

	public void setComgM3(float comgM3) {
		this.comgM3 = comgM3;
	}

	public float getCo8hmgM3() {
		return this.co8hmgM3;
	}

	public void setCo8hmgM3(float co8hmgM3) {
		this.co8hmgM3 = co8hmgM3;
	}

	public int getNogm3() {
		return this.nogm3;
	}

	public void setNogm3(int nogm3) {
		this.nogm3 = nogm3;
	}

	public int getNo2() {
		return this.no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public String getNo2ica() {
		return this.no2ica;
	}

	public void setNo2ica(String no2ica) {
		this.no2ica = no2ica;
	}

	public int getNoxgm3() {
		return this.noxgm3;
	}

	public void setNoxgm3(int noxgm3) {
		this.noxgm3 = noxgm3;
	}

	public float getPm10() {
		return this.pm10;
	}

	public void setPm10(float pm10) {
		this.pm10 = pm10;
	}

	public String getPm10ica() {
		return this.pm10ica;
	}

	public void setPm10ica(String pm10ica) {
		this.pm10ica = pm10ica;
	}

	public float getPm25() {
		return this.pm25;
	}

	public void setPm25(float pm25) {
		this.pm25 = pm25;
	}

	public String getPm25ica() {
		return this.pm25ica;
	}

	public void setPm25ica(String pm25ica) {
		this.pm25ica = pm25ica;
	}

	public float getSo2() {
		return this.so2;
	}

	public void setSo2(float so2) {
		this.so2 = so2;
	}

	public String getSo2ica() {
		return this.so2ica;
	}

	public void setSo2ica(String so2ica) {
		this.so2ica = so2ica;
	}

	public String getIcastation() {
		return this.icastation;
	}

	public void setIcastation(String icastation) {
		this.icastation = icastation;
	}

}
