package interfacesaccenture.autos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ManejarAutos {
	static int velocidadInicial = 10;
	static List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>(); //Uso de Interfaz Collection de Java
	public static void main(String[] args) {
		genera();

	}
	
    static void recogerVehiculo(Vehiculo val){
        System.out.println("Salida de pista "+ val.toString());

    }
    static String acelerar(int cantidad,Vehiculo vei){
        return vei.acelerar(cantidad, vei.getVelocidad());
    }
    
    static String frenar(int cantidad,Vehiculo vei){
        return vei.frenar(cantidad, vei.getVelocidad());
    }
    
    public static void genera() {
    	System.out.println("Inicio de carrera...");
    	listaVehiculos.add(new Moto(50));
    	listaVehiculos.add(new Carro(60));
    	listaVehiculos.add(new Moto(20));
    	listaVehiculos.add(new Moto(30));
    	listaVehiculos.add(new Carro(40));
    	listaVehiculos.add(new Moto(50));

        avanza();

        System.out.println("Termina la carrera.");
    }
    public static void avanza(){
        System.out.println("Avanzando...");
        
        //listaVehiculos.forEach(s -> System.out.println(s));
        
        listaVehiculos.forEach(new Consumer<Vehiculo>() {
            public void accept(Vehiculo v) {
                System.out.println("Llamando a acelerar con velocidad inicial: " + velocidadInicial + " " +acelerar(velocidadInicial, v));
                System.out.println("Llamando a frenar con velocidad inicial: " + velocidadInicial + " " + frenar(10, v));
                recogerVehiculo(v);
            }
        });
     
    }
}
