package ohtu.verkkokauppa;

public interface Maksulaitos {

  boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}