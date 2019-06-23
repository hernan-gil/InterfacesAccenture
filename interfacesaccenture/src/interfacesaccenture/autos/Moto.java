package interfacesaccenture.autos;

public class Moto implements Vehiculo {
	public Moto(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	int velocidad = 80;
	@Override
	public String frenar(int cuanto, int nuevaVelocidad) {  //metodo heredado de Vehiculo
        velocidad-=cuanto;
        nuevaVelocidad = velocidad;
        String retorno = ""; 
        if (velocidad > 0) {
        	System.out.println("Moto Frenando, nueva velocidad es: " + velocidad);
        	frenar(10, nuevaVelocidad);
        	retorno += "La moto esta frenando y va a "+velocidad+"km/hora";
        }
        return retorno;
	}

	@Override
	public String acelerar(int cuanto, int nueva) {  //metodo heredado de Vehiculo
        String cadena = "";
        velocidad+=cuanto;
        nueva = velocidad;
        if (velocidad > VELOCIDAD_MAXIMA) {
        	cadena = "Exceso de velocidad. ";
        } else {
        	acelerar(10, nueva);
        	cadena += "La moto ha acelerado y va a "+velocidad+"km/hora";
        }
        return cadena;
	}

	@Override
	public Integer ruedas() { //metodo heredado de Vehiculo
		return 2;
	}

	@Override
	public Integer cupo() { //metodo heredado de Vehiculo
		return 2;
	}

	@Override
	public Integer cilindraje() { //metodo heredado de Vehiculo
		return 200;
	}

	@Override
	public Double caballosDeFuerza() { //metodo heredado de Vehiculo
		return 15.0;
	}
	
	@Override
	public Integer getVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		return "Moto [velocidad=" + velocidad + "]";
	}
}
