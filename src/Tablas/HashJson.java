package Tablas;
// Generated 11-ene-2021 23:05:26 by Hibernate Tools 5.4.18.Final

/**
 * HashJson generated by hbm2java
 */
public class HashJson implements java.io.Serializable {

	private String url;
	private String hash;

	public HashJson() {
	}

	public HashJson(String url, String hash) {
		this.url = url;
		this.hash = hash;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
