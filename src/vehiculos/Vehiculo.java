package vehiculos;

import java.util.List;

import enums.Combustibles;
import enums.Transmisiones;
import records.Owner;

import java.util.ArrayList;
import java.util.Iterator;
//clase abstracta con metodos abstractos, con esto implementamos la abstraccion de un vehiculo real
public abstract class Vehiculo {
	//atributos marca modelo, anio, enums de combustible y transmision, y record de owner.
	private String marca;
	private String modelo;
	private int anio;
	private Combustibles combustible;
	private Transmisiones transmision;
	protected Owner owner;
	public static int numVehiculos; //variable estatica para enlistar el numero de vehiculos creados
	
	//Constructor que incrementa la cantidad de vehiculos guardados en una variable estatica
	public Vehiculo(String marca, String modelo, int anio, 
			Combustibles combustible, Transmisiones transmision, Owner owner) {
		numVehiculos++;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.combustible = combustible;
		this.transmision = transmision;
		this.owner = owner;
	}
	
	abstract void encender();
	abstract void apagar();
	
	public void listarVehiculos() {
		class vehiculoCollection{
			private List<Vehiculo> vehiculos;
			public vehiculoCollection() {
				vehiculos = new ArrayList<>();
			}
			public void addVehiculo(Vehiculo vehiculo) {
				vehiculos.add(vehiculo);
			}
			public void mostrarVehiculos() {
				for (Vehiculo vehiculo : vehiculos) {
					System.out.println(vehiculo);
				}
			}
		}
	}
	
	//Se implementa Encapsulamiento al implementar setters y getters.
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public Combustibles getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustibles combustible) {
		this.combustible = combustible;
	}

	public Transmisiones getTransmision() {
		return transmision;
	}

	public void setTransmision(Transmisiones transmision) {
		this.transmision = transmision;
	}

	public static int getNumVehiculos() {
		return numVehiculos;
	}

	public static void setNumVehiculos(int numVehiculos) {
		Vehiculo.numVehiculos = numVehiculos;
	}

	
}
