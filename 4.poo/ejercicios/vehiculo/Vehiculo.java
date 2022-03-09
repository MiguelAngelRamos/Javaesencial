package poo.ejercicios.vehiculo;

public class Vehiculo {
	// private solo es accesible dentro de la clase Vehiculo
	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String mostrarDatos() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio + "\n";
	}
	
	
	
	
}
