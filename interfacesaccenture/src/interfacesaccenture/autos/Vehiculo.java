package interfacesaccenture.autos;

public interface Vehiculo {
	static int VELOCIDAD_MAXIMA=90;

    String frenar(int cuanto, int nueva);
    String acelerar(int cuanto, int nueva);
    Integer ruedas();
    Integer cupo();
    Integer cilindraje();
    Double caballosDeFuerza();
    Integer getVelocidad();
}
