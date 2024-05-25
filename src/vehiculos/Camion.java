package vehiculos;

import enums.Combustibles;
import enums.Transmisiones;
import records.Owner;
//clase camion hereda de Vehiculo
public class Camion extends Vehiculo{
	public Camion(String marca, String modelo, int anio, 
			Combustibles combustible, Transmisiones transmision, Owner owner) {
		//Se llama al constructor de la clase padre
		super(marca, modelo, anio, combustible, transmision, owner);
	}
	//Se hace polimorfismo al implemetar los metodos de vehiculo implementados par Camion
	@Override
	void encender() {
		System.out.println("El camion esta encendido");
		
	}

	@Override
	void apagar() {
		System.out.println("El camion esta encendido");
		
	}

}
