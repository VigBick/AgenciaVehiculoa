package vehiculos;

import enums.Combustibles;
import enums.Transmisiones;
import records.Owner;
//clase coche hereda de Vehiculo
public class Coche extends Vehiculo{
	
	public Coche(String marca, String modelo, int anio, 
			Combustibles combustible, Transmisiones transmision, Owner owner) {
		//Se llama al constructor de la clase padre
		super(marca, modelo, anio, combustible, transmision, owner);
	}
	
	//Se hace polimorfismo al implemetar los metodos de vehiculo implementados par Coche
	@Override
	void apagar() {
		System.out.println("El coche esta encendido");
		
	}

	@Override
	void encender() {
		System.out.println("El coche esta apagado");
		
	}

}
