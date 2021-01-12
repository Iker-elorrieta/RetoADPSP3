package Objetos;

public class Links {
private String NombreFichero;
private String link;
private String nombrePueblo;

public String getNombrePueblo() {
	return nombrePueblo;
}

public void setNombrePueblo(String nombrePueblo) {
	this.nombrePueblo = nombrePueblo;
}

public Links(String nombreFichero, String link) {
	super();
	NombreFichero = nombreFichero;
	this.link = link;
}

public Links() {
}



public String getNombreFichero() {
	return NombreFichero;
}

public void setNombreFichero(String nombreFichero) {
	NombreFichero = nombreFichero;
}

public String getLink() {
	return link;
}

public void setLink(String link) {
	this.link = link;
}


}
