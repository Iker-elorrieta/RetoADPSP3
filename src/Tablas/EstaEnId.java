package Tablas;
// Generated 19-ene-2021 15:28:32 by Hibernate Tools 5.4.18.Final

/**
 * EstaEnId generated by hbm2java
 */
public class EstaEnId implements java.io.Serializable {

	private int codEspacio;
	private int codCiudad;

	public EstaEnId() {
	}

	public EstaEnId(int codEspacio, int codCiudad) {
		this.codEspacio = codEspacio;
		this.codCiudad = codCiudad;
	}

	public int getCodEspacio() {
		return this.codEspacio;
	}

	public void setCodEspacio(int codEspacio) {
		this.codEspacio = codEspacio;
	}

	public int getCodCiudad() {
		return this.codCiudad;
	}

	public void setCodCiudad(int codCiudad) {
		this.codCiudad = codCiudad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstaEnId))
			return false;
		EstaEnId castOther = (EstaEnId) other;

		return (this.getCodEspacio() == castOther.getCodEspacio()) && (this.getCodCiudad() == castOther.getCodCiudad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodEspacio();
		result = 37 * result + this.getCodCiudad();
		return result;
	}

}
