package Tablas;
// Generated 19-ene-2021 15:28:32 by Hibernate Tools 5.4.18.Final

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
