package poo;

public class Automovil {
	
	public String marca;
	public String modelo;
	public String color;
	public double precio;
	public String patente;
	
	public Automovil() {
		 this("", "", "verde", 0, "");
		// this.color = "verde";
	}
	public Automovil(String marca, String modelo, String color, double precio, String patente) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.patente = patente;
	}
	
	public Automovil(String marca, String modelo) {
		// this.marca = marca;
		// this.modelo = modelo;
		this(marca, modelo, "", 0, "");
	}
	
	
	public void encender() {
		System.out.println("Encender ...");
	}
	
	public void arrancar() {
		System.out.println("Arrancar ....");
	}
	
	public void detener() {
		System.out.println("Detener...");
	}
	
	public void acelerar() {
		System.out.println("Acelerar...");
	}
	
	public void imprimirAutoMovil() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Color: " + color);
		System.out.println("Precio: " + precio);
		System.out.println("Patente: " + patente);
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", patente=" + patente + "]";
	}
	
	
	
}
