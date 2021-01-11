package Tablas;
// Generated 11-ene-2021 23:05:26 by Hibernate Tools 5.4.18.Final

/**
 * Favoritos generated by hbm2java
 */
public class Favoritos implements java.io.Serializable {

	private Integer codFavorito;
	private Usuarios usuarios;
	private int codUbicacion;
	private boolean tipoUbicacion;

	public Favoritos() {
	}

	public Favoritos(Usuarios usuarios, int codUbicacion, boolean tipoUbicacion) {
		this.usuarios = usuarios;
		this.codUbicacion = codUbicacion;
		this.tipoUbicacion = tipoUbicacion;
	}

	public Integer getCodFavorito() {
		return this.codFavorito;
	}

	public void setCodFavorito(Integer codFavorito) {
		this.codFavorito = codFavorito;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public int getCodUbicacion() {
		return this.codUbicacion;
	}

	public void setCodUbicacion(int codUbicacion) {
		this.codUbicacion = codUbicacion;
	}

	public boolean isTipoUbicacion() {
		return this.tipoUbicacion;
	}

	public void setTipoUbicacion(boolean tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}

}
