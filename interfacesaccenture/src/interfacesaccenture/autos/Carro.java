package interfacesaccenture.autos;

public class Carro implements Vehiculo {
	int velocidad=100;
	@Override
	public String frenar(int cuanto, int nuevaVelocidad) { //metodo heredado de Vehiculo
        velocidad-=cuanto;
        nuevaVelocidad = velocidad;
        String retorno = ""; 
        if (velocidad > 0) {
        	System.out.println("Carro Frenando, nueva velocidad es: " + velocidad);
        	frenar(20, nuevaVelocidad);
        	retorno += "El carro esta frenando y va a "+velocidad+"km/hora";
        }
        return retorno;
	}

	@Override
	public String acelerar(int cuanto, int nueva) { //metodo heredado de Vehiculo
        String cadena="";
        velocidad+=cuanto;
        if (velocidad>VELOCIDAD_MAXIMA)
            cadena="Exceso de velocidad. ";
        cadena+="El carro ha acelerado y va a "+velocidad+"km/hora";
        return cadena;
	}

	public Carro(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	@Override
	public Integer cupo() { //metodo heredado de Vehiculo
		return 4;
	}

	@Override
	public Integer ruedas() { //metodo heredado de Vehiculo
		return 2;
	}

	@Override
	public Integer cilindraje() { //metodo heredado de Vehiculo
		return 1600;
	}

	@Override
	public Double caballosDeFuerza() { //metodo heredado de Vehiculo
		return 112.5;
	}
	@Override
	public Integer getVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		return "Carro [velocidad=" + velocidad + "]";
	}
}
