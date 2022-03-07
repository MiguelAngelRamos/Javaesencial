package poo.encapsulamiento;
// fuertemente encapsulada
public class AutoMovil {
	
	private String marca;
	private String modelo;
	private String patente;
	private double precio;
	
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
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "AutoMovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", precio=" + precio + "]";
	}
	
	
	
}
