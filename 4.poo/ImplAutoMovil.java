package poo;

public class ImplAutoMovil {
	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
	
		auto.imprimirAutoMovil();
		auto.marca = "Tesla";
		System.out.println(auto);
		
		auto.encender();
		auto.arrancar();
		auto.acelerar();
		auto.detener();
		
	}
}
//ford mustang gasolina