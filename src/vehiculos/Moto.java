package vehiculos;

import enums.Combustibles;
import enums.Transmisiones;
import records.Owner;
//clase moto hereda de Vehiculo
public class Moto extends Vehiculo{

	public Moto(String marca, String modelo, int anio, 
			Combustibles combustible, Transmisiones transmision, Owner owner) {
		//Se llama al constructor de la clase padre
		super(marca, modelo, anio, combustible, transmision, owner);
	}
	
	//Se hace polimorfismo al implemetar los metodos de vehiculo implementados par moto
	@Override
	void encender() {
		System.out.println("La moto esta encendida");
		
	}

	@Override
	void apagar() {
		System.out.println("La moto esta apagada");
		
	}

}
